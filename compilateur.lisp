;Result of a recursive call should always be found in :R0
;first parameter of a function is pushed onto stack first

;TODO: redesign env to include 2 separate association lists, one for current scope,
;one for parent scope--define function to check for association--new list will also
;be used to build stack frame with variables

;@returns a list of commands
(defun comp-expr (expr env)
  (if (atom expr)
    (if (constantp expr)
      (command-binary :MOVE (list :CONST expr) :R0)
        (if (in-env expr env)
          (append
            ;put address in :R0
            (param-addr (cdr (in-env expr env)))
            ;move address to :R1
            (command-binary :MOVE :R0 :R1)
            ;load contents of address into :R0
            (command-binary :LOAD :R1 :R0))
            (warn "unrecognized symbol")))
    (if (equal 'if (car expr))
      (if-statement expr env)
    ;(warn "no case followed")
      (command-unary :UNKNOWNEXPR expr))))

(defun create-label (etiq)
  (list (append (list :LABEL) (list etiq))))

(defun command-binary (command arg1 arg2)
  (list (list command arg1 arg2)))

(defun command-unary (command arg)
  (list (list command arg)))

;pre: offset is the integer offset of a parameter of interest
(defun param-addr (offset)
  (append
    (command-binary :MOVE :FP :R0) ;get FP
    (command-binary :LOAD :FP :R1) ;get nargs
    (command-binary :SUB :R1 :R0)
    (command-binary :ADD (command-unary :CONST offset) :R0)))

(defun literal (expr env)
  (command :MOVE expr :R0))

(defun if-statement (expr env)
  ((lambda (etiq-else etiq-after)
    (append (conditional-jump expr env etiq-else)
      (comp-expr (car (cdr (cdr expr))) env)
      (command-unary :JMP etiq-after)
      (create-label etiq-else)
      (comp-expr (car (cdr (cdr (cdr expr)))) env)
      (create-label etiq-after))) (gensym) (gensym)))

;TODO other conditions besides < > =
; any other boolean evaluation
; or statement
;currently jumps if NOT < > =
(defun conditional-jump (expr env etiq)
  (labels (
    (handle-or (expr env etiq-else etiq-then)
      )))
  (if (equal 'or (car (cdr expr)))
    )
  (append (comp-expr (car (cdr (car (cdr expr)))) env) '((:MOVE :R0 :R1))
    (comp-expr (car (cdr (cdr (car (cdr expr))))) env) '((:MOVE :R0 :R2))
    '((:CMP :R1 :R2)) (list (list
      (case (car (car (cdr expr)))
      ('> :JLE)
      ;(comp-expr expr1) (:MOVE :R0 :R1) (comp-expr expr2) (:MOVE :R0 :R2) (:CMP :R1 :R2)
      ('< :JGE)
      ('= :JNE)
      ) etiq))))

(defun arith-op (expr env)
  (append
    (comp-expr (car (cdr (cdr expr))) env) ;flip order between lisp order and assembly order
    '((:MOVE :R0 :R1))
    (comp-expr (car (cdr expr)) env)
    (command-binary
    (case (car expr)
      ('+ :ADD)
      ('- :SUB)
      ('* :MULT)
      ('/ :DIV))
      :R1 :R0)))

;for lambda/labels, add different way to move parameters from old frame to new frame
;expr format: (name . (args))
(defun function-call (expr env)
  (labels
    ((next-arg (expr env instructions)
      (if (null expr)
        instructions
        (next-arg
          (cdr expr)
          env
          (append
            instructions
            (comp-expr (car expr) env)
            (command-unary :PUSH :R0)))))
    (parent-args (count max instructions)
      (if (< max count)
        instructions
        (parent-args
          (+ 1 count)
          max
          (append
            instructions
            (param-addr count)
            (command-binary :MOVE :R0 :R1)
            (command-binary :LOAD :R1 :R0)
            (command-unary :PUSH :R0))))))
  ((lambda (nargs)
    (append
    (parent-args 1 (length (parent-scope env)) nil)
    (next-arg (cdr expr) env nil)
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
    (length (cdr expr)))))

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
        (make-env (car (cdr expr)) env)
        (command-unary :LABEL (car expr)))
      (list (list :RTN)))))

;expr format (defun name params)
(defun defun-def (expr env)
  (function-def (cdr expr) env))

;expr format: ((lambda (args) instructions) params)
(defun lambda-def (expr env)
  ((lambda (def params env end)
    (append
      (function-call (append (list (car def)) params) env)
      (command-unary :JMP end)
      (function-def def env)
      (command-unary :LABEL end)))
    (append
      (list (gensym))
      (cdr (car expr)))
    (cdr expr)
    env
    (gensym)))

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
    (append
      (fun-exprs (car (cdr expr)) env nil)
      (inst-exprs (cdr (cdr expr)) env nil))))

;expr format: (name params)
(defun labels-function-def (expr env)
  (function-def expr env))

;((current-assoc-list) (parent-assoc-list) (env-assoc-list))
(defun make-env (params parent-env)
  (labels
    ((add-variable (rest-params count env)
      (if (null rest-params)
        env
        (add-variable
          (cdr rest-params)
          (+ 1 count)
          (acons (car rest-params) count env)))))
    ((lambda (current parent)
      (list current parent (append current parent)))
      ;zero index param offsets
      (add-variable params (length (current-scope parent-env)) nil)
      (car (cdr (cdr parent-env))))))

(defun in-env (key env)
  (assoc key (car (cdr (cdr env)))))

(defun parent-scope (env)
  (car (cdr env)))

(defun child-scope (env)
  (car env))

(defun current-scope (env)
  (car (cdr (cdr env))))
