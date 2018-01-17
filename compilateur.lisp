;Result of a recursive call should always be found in :R0
;first parameter of a function is pushed onto stack first

;TODO: redesign env to include 2 separate association lists, one for current scope,
;one for parent scope--define function to check for association--new list will also
;be used to build stack frame with variables

;@returns a list of commands
(defun comp-expr (expr env)
  (if (atom expr)
    (if (constantp expr)
      (literal expr)
        (if (in-env expr env)
          (append
            ;put address in :R0
            (param-addr (cdr (in-env expr env)))
            ;move address to :R1
            (command-binary :MOVE :R0 :R1)
            ;load contents of address into :R0
            (command-binary :LOAD :R1 :R0))
            (command-unary :UNKNOWNSYM expr)))
    (if (equal 'if (car expr))
      (if-statement expr env)
      (if (or
        (equal '+ (car expr))
        (equal '- (car expr))
        (equal '* (car expr))
        (equal '/ (car expr)))
        (arith-op expr env)
        (if (equal 'defun (car expr))
          (defun-def expr env)
          (if (equal 'labels (car expr))
            (labels-def expr env)
            (if (equal 'cons (car expr))
              (cons-command expr env)
              (if (equal 'car (car expr))
                (car-command expr env)
                (if (equal 'cdr (car expr))
                  (cdr-command expr env)
                  (if (listp (car expr))
                    (if (equal 'lambda (car (car expr)))
                      (lambda-def expr env)
                      (command-unary :INVALIDEXPR expr))
                    (if (equal 'QUOTE (car expr))
                      (literal (car (cdr expr)))
                      (function-call expr env))))))))))))

(defun create-label (etiq)
  (list (append (list :LABEL) (list etiq))))

(defun command-binary (command arg1 arg2)
  (list (list command arg1 arg2)))

(defun command-unary (command arg)
  (list (list command arg)))

(defun const (constant)
  (list :CONST constant))

(defun return-command ()
  (list (list :RTN)))

;expr format: (car sous-expr)
(defun car-command (expr env)
  (append
    (comp-expr (car (cdr expr)) env)
    (command-unary :CAR :R0)))

(defun cdr-command (expr env)
  (append
    (comp-expr (car (cdr expr)) env)
    (command-unary :CDR :R0)))

(defun cons-command (expr env)
  (append
    (comp-expr (car (cdr expr)) env)
    (command-unary :PUSH :R0)
    (comp-expr (cdr (cdr expr)) env)
    (command-unary :POP :R1)
    (command-binary :CAR :R1 :R0)))
;pre: offset is the integer offset of a parameter of interest
;ATTN modifies :R5 !!!!!
(defun param-addr (offset)
  (append
    (command-binary :MOVE :FP :R0) ;get FP
    (command-binary :LOAD :FP :R5) ;get nargs
    (command-binary :SUB :R5 :R0)
    (command-binary :ADD (const offset) :R0)))

(defun literal (expr)
  (command-binary :MOVE (const expr) :R0))

;expr format: (if (condition) then otherwise)
(defun if-statement (expr env)
  ((lambda (etiq-otherwise etiq-end)
    (append
      (conditional-jump (car (cdr expr)) env etiq-otherwise)
      (comp-expr (car (cdr (cdr expr))) env)
      (command-unary :JMP etiq-end)
      (create-label etiq-otherwise)
      (comp-expr (car (cdr (cdr (cdr expr)))) env)
      (create-label etiq-end))) (gentemp) (gentemp)))

;currently jumps if NOT < > = (jumps when condition is NOT true)
;expr format ((< | > | =) a b) | (or expr*) | (function-call)
(defun conditional-jump (expr env etiq)
  (labels (
    (eval-expression (expr env etiq)
      (if (or
        (equal (car expr) '<)
        (equal (car expr) '>)
        (equal (car expr) '=)
        (equal (car expr) '<=)
        (equal (car expr) '>=))
        (append
          (comp-expr (car (cdr expr)) env)
          (command-unary :PUSH :R0)
          (comp-expr (car (cdr (cdr expr))) env)
          (command-unary :POP :R1)
          (command-binary :MOVE :R0 :R2)
          (command-binary :CMP :R1 :R2)
          (command-unary
            (if (equal (car expr) '>)
              :JLE
              (if (equal (car expr) '<)
                :JGE
                (if (equal (car expr) '=)
                  :JNE
                  (if (equal (car expr) '<=)
                    :JGT
                    (if (equal (car expr) '>=)
                      :JLT
                      (warn "illegal comparison"))))))
            etiq))
        (if (equal (car expr) 'or)
          ((lambda (if-true)
            (append
              (handle-or (cdr expr) env if-true nil)
              (command-unary :JMP etiq)
              (command-unary :LABEL if-true)))
              (gentemp))
          (append
            (comp-expr expr env)
            (command-binary :MOVE :R0 :R1)
            (command-binary :MOVE (const nil) :R2)
            (command-binary :CMPE :R1 :R2)
            (command-unary :JEQ etiq)))))
    ;expr format: (condition*)
    (handle-or (expr env if-true commands)
      (if (null expr)
        commands
        ((lambda (next-etiq)
          (handle-or
            (cdr expr)
            env
            if-true
            (append
              commands
              (eval-expression (car expr) env next-etiq)
              (command-unary :JMP if-true)
              (command-unary :LABEL next-etiq))))
          (gentemp)))))
    (eval-expression expr env etiq)))

;expr format: (operator x1 x2)
(defun arith-op (expr parent-env)
  (labels
    ((extra-operands (operands operator env commands)
      (if (null operands)
        commands
        (extra-operands
          (cdr operands)
          operator
          env
          (append
            commands
            (command-binary :MOVE :R0 :R2)
            (param-addr (cdr (in-env (car operands) env)))
            (command-binary :LOAD :R0 :R1)
            (command-binary :MOVE :R2 :R0)
            (command-binary operator :R1 :R0)))))
      (genargs (count args)
        (if (= count 0)
          (cons (make-env args parent-env nil) args)
          (genargs (- count 1) (append args (list (gentemp)))))))
      ;params format (env . parameters)
      ((lambda (operator name end params)
        (append
          (function-call
            (append (list name) (cdr expr))
            (add-child-function (list name) parent-env))
          (command-unary :JMP end)
          (command-unary :LABEL name)
          (param-addr (cdr (in-env (car (cdr params)) (car params))))
          (command-binary :MOVE :R0 :R1)
          (command-binary :LOAD :R1 :R0)
          (extra-operands
            (cdr (cdr params))
            operator
            (car params)
            nil)
          (return-command)
          (command-unary :LABEL end)))
        (if (equal (car expr) '+)
          :ADD
          (if (equal (car expr) '-)
            :SUB
            (if (equal (car expr) '*)
              :MULT
              (if (equal (car expr) '/)
              :DIV
              (warn "given arith-op is not an arithop")))))
        (gentemp)
        (gentemp)
        (genargs (length (cdr expr)) nil))))


;for lambda/labels, add different way to move parameters from old frame to new frame
;expr format: (name . (args))
(defun function-call (expr env)
  (labels
    ((next-arg (expr instructions)
      (if (null expr)
        instructions
        (next-arg
          (cdr expr)
          (append
            instructions
            (comp-expr (car expr) env)
            (command-unary :PUSH :R0)))))
    (parent-args (count max instructions)
      (if (< count max)
        (parent-args
          (+ 1 count)
          max
          (append
            instructions
            (param-addr count)
            (command-binary :MOVE :R0 :R1)
            (command-binary :LOAD :R1 :R0)
            (command-unary :PUSH :R0)))
          instructions)))
  ((lambda (nargs instructions)
    (append
      instructions
      (next-arg (cdr expr) nil)
      (command-unary :PUSH (list :CONST nargs))
      (command-binary :MOVE :FP :R1)
      (command-binary :MOVE :SP :FP)
      (command-binary :MOVE :SP :R2)
      (command-binary :SUB (list :CONST nargs) :R2)
      (command-unary :DECR :R2)
      (command-unary :PUSH :R2)
      (command-unary :PUSH :R1)
      (command-unary :JSR (car expr))
      (command-unary :POP :R1)
      (command-unary :POP :R2)
      (command-binary :MOVE :R1 :FP)
      (command-binary :MOVE :R2 :SP)))
    (+
      (length (cdr expr))
      (if (member (car expr) (child-function-scope env))
        (length (current-scope env))
        0))
    (if (member (car expr) (child-function-scope env))
      (parent-args 0 (length (current-scope env)) nil)
      nil))))

;expr format: (name (params) instructions)
(defun function-def (expr env)
  (labels
    ((next-expr (rest-exprs env commands)
      (if (null rest-exprs)
        commands
        (next-expr
          (cdr rest-exprs)
          env
          (append commands (comp-expr (car rest-exprs) env))))))
    (append
      (next-expr
        (cdr (cdr expr))
        (make-env (car (cdr expr)) env (cdr (cdr expr)))
        (command-unary :LABEL (car expr)))
      (return-command))))

;expr format (defun name params)
(defun defun-def (expr env)
  (function-def (cdr expr) env))

;expr format: ((lambda (args) instructions) params)
(defun lambda-def (expr env)
  ;def format: ((args) instructions)
  ((lambda (name def params env end)
      (append
      (function-call (append (list name) params) (add-child-function (list name) env))
      (command-unary :JMP end)
      (function-def (append (list name) def) env)
      (command-unary :LABEL end)))
    (gentemp)
    (cdr (car expr))
    (cdr expr)
    env
    (gentemp)))

;expr format: (labels (functions) instructions)
(defun labels-def (expr env)
  (labels
    ((fun-exprs (rest-exprs env commands)
      (if (null rest-exprs)
        commands
        (fun-exprs
          (cdr rest-exprs)
          env
          (append commands (labels-function-def (car rest-exprs) env)))))
    (inst-exprs (rest-exprs env commands)
      (if (null rest-exprs)
        commands
        (inst-exprs
          (cdr rest-exprs)
          env
          (append commands (comp-expr (car rest-exprs) env))))))
    ((lambda (end)
    (append
      (inst-exprs (cdr (cdr expr)) env nil)
      (command-unary :JMP end)
      (fun-exprs (car (cdr expr)) env nil)
      (command-unary :LABEL end))) (gentemp))))

;expr format: (name params)
(defun labels-function-def (expr env)
  (function-def expr env))

;((child-assoc-list) (parent-assoc-list) (current-assoc-list) (child-functions-list))
(defun make-env (params parent-env instructions)
  (labels
    ((add-variable (rest-params count env)
      (if (null rest-params)
        env
        (add-variable
          (cdr rest-params)
          (+ 1 count)
          (acons (car rest-params) count env))))
    (add-functions (labels-def functions)
      (if (null labels-def)
        functions
        (add-functions
          (cdr labels-def)
          (append functions (list (car (car labels-def)))))))
    (child-functions (rest-instructions functions)
      (if (null rest-instructions)
        functions
        (child-functions
          (cdr instructions)
          (if (and
              (listp (car rest-instructions))
              (equal (car (car rest-instructions)) 'labels))
            (append functions (add-functions (car (cdr (car rest-instructions))) nil))
            functions)))))
    ((lambda (current parent)
      (list current parent (append current parent) (child-functions instructions nil)))
      ;zero index param offsets
      (add-variable params (length (current-scope parent-env)) nil)
      (car (cdr (cdr parent-env))))))

;a cheat because, for function-call to grab and push parent parameters, the functions
;it is calling must be a function within its scope
(defun add-child-function (functions env)
  (list
    (car env)
    (car (cdr env))
    (car (cdr (cdr env)))
    (append functions (car (cdr (cdr (cdr env)))))))

(defun in-env (key env)
  (assoc key (current-scope env)))

(defun parent-scope (env)
  (car (cdr env)))

(defun child-scope (env)
  (car env))

(defun current-scope (env)
  (car (cdr (cdr env))))

(defun child-function-scope (env)
  (car (cdr (cdr (cdr env)))))

(defun comp-file (file-in file-out)
  (labels
    ((read-stream (stream expr-list)
      (if (listen stream)
        (read-stream stream
          ((lambda (expr)
            (if (null expr)
              expr-list
              (append expr-list (list expr))))
              (read stream nil)))
        expr-list))
    (comp-exprs (exprs commands)
      (if (null exprs)
        commands
        (comp-exprs (cdr exprs) (append commands (comp-expr (car exprs) nil))))))
    (with-open-file (os file-out :direction :output)
      (print-object
        (comp-exprs (with-open-file (is file-in) (read-stream is nil)) nil)
        os))))
