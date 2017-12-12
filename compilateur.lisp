;Result of a recursive call should always be found in :R0
;first parameter of a function is pushed onto stack first

;@returns a list of commands
(defun comp-expr (expr env)
  (cond
    ((atom expr)
      (if (constantp expr)
        (command-binary :MOVE (list :CONST expr) :R0)
        (if (assoc expr env)
          (param-addr (cdr (assoc expr env)))
          (warn "unrecognized symbol"))))
    ((equal 'if (car expr)) (if-statement expr env))
    (T (warn "no case followed"))))

(defun create-label (etiq)
  (list (append (list :LABEL) (list etiq))))

(defun command-binary (command arg1 arg2)
  (list (list command arg1 arg2)))

(defun command-unary (command arg)
  (list (list command arg)))

;pre: offset is the integer offset of a parameter of interest
(defun param-addr (offset)
  (append '((:MOVE :FP :R0))
    (list (list :ADD (list :CONST offset) :R0))))

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

(defun function-call (expr env)
  (labels
    ((next-arg (expr env)
    (if (null expr)
      nil
      (append
      (comp-expr (car expr) env)
      (command-unary :PUSH :R0)
      (next-arg (cdr expr) env)))))
  ((lambda (nargs)
    (append
    (next-arg (cdr expr) env)
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
    (list-length (cdr expr)))))

(defun defun-def (expr env)
  (labels
    ((next-expr (rest-exprs env commands)
      (if (null rest-exprs)
        commands
        (next-expr
          (cdr rest-exprs)
          env
          (append commands (comp-expr (car rest-exprs) env))))))
    (next-expr
      (cdr (cdr (cdr expr)))
      (make-env (car (cdr (cdr expr))))
      (command-unary :LABEL (car (cdr expr))))))

(defun lambda-def (expr env)
  )

(defun make-env (params)
  (labels
    ((add-variable (rest-params env count)
      (if (null rest-params)
        env
        (add-variable
          (cdr rest-params)
          (acons (car rest-params) count env)
          (+ count 1)))))
    (add-variable params nil 1)))
