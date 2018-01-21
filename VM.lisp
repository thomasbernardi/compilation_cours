(defun make-vm (vm size)
  (setf (get vm :memory) (make-array size))
  (set-register vm :SP -1))

(defun call-function (vm name args)
  (labels
    ((next-arg (rest-args)
      (if (null rest-args)
        nil
        (progn
          (print rest-args)
          (vm-push-im vm (car rest-args))
          (next-arg (cdr rest-args))))))
  ((lambda (nargs)
    (progn
      (next-arg args)
      (vm-push-im vm nargs)
      ;(command-unary :PUSH (list :CONST nargs))
      (move vm :FP :R1)
      ;(command-binary :MOVE :FP :R1)
      (move vm :SP :FP)
      ;(command-binary :MOVE :SP :FP)
      (move vm :SP :R2)
      ;(command-binary :MOVE :SP :R2)
      (vm-sub-im vm nargs :R2)
      ;(command-binary :SUB (list :CONST nargs) :R2)
      (decrement vm :R2)
      ;(command-unary :DECR :R2)
      (vm-push vm :R2)
      ;(command-unary :PUSH :R2)
      (vm-push vm :R1)
      ;(command-unary :PUSH :R1)
      (move vm :SP :R1)
      (vm-push-im vm (list :HALT))
      (vm-push vm :R1)
      (vm-jump vm (car (gethash name (get vm :label-table))))
      (vm-run vm)
      (print (get-register vm :PC))
      ;(command-unary :JSR (car expr))
      (vm-pop vm :R1)
      (vm-pop vm :R1)
      ;(command-unary :POP :R1)
      (vm-pop vm :R2)
      ;(command-unary :POP :R2)
      (move vm :R1 :FP)
      ;(command-binary :MOVE :R1 :FP)
      (move vm :R2 :SP)
      ;(command-binary :MOVE :R2 :SP)
      (get-register vm :R0)))
    (length args))))

(defun load-file (vm filename)
  (load-instructions vm (read-file filename)))

(defun read-file (filename)
  (with-open-file (is filename)
    (read is filename)))

;assumes this will only occur once (hash-table is initialized within this function)
(defun load-instructions (vm instructions)
  (setf (get vm :label-table) (make-hash-table))
  (labels (
    ;iterates through instructions applying function to each instructions
    ;returning the number of instructions iterated through
    (read-instructions (instructions counter function)
    (if (null instructions)
      (- counter 1)
      (progn
        (funcall function (car instructions) counter)
        (read-instructions (cdr instructions) (+ counter 1) function))))
    ;substitutes value of a given label when said label appears in a
    ;jump instruction
    (apply-label (instruction counter)
      (if (null instruction)
        (warn "your instruction was null when it shouldn't have been, shame on you")
        (set-memory vm counter ((lambda (name instruction)
          (if (or
            (equal name :JGT)
            (equal name :JEQ)
            (equal name :JLT)
            (equal name :JGE)
            (equal name :JLE)
            (equal name :JMP)
            (equal name :JNE))
            (cons name (gethash (car (cdr instruction)) (get vm :label-table)))
            (if (equal name :JSR)
              (if (gethash (car (cdr instruction)) (get vm :label-table))
                (cons name (gethash (car (cdr instruction)) (get vm :label-table)))
                (cons :LSPFN (cdr instruction)))
                instruction))) (car instruction) instruction))))
      ;looks for all appearances of "label" and adds label/address paire
      ;to label-table
      (set-label (instruction counter)
        (if (equal (car instruction) :LABEL)
          (if (gethash (car (cdr instruction)) (get vm :label-table))
            (warn "you defined a label twice you dimwit")
              (setf (gethash (car (cdr instruction)) (get vm :label-table))
                (cons counter nil))
            ))))
      (progn
        (read-instructions instructions (+ 1 (get-register vm :SP)) #'set-label)
        (set-register vm :SP
          (read-instructions instructions (+ 1 (get-register vm :SP)) #'apply-label)))))

(defun get-register (vm name)
  (get vm name))

(defun set-register (vm name value)
  (setf (get vm name) value))

(defun get-memory (vm address)
  (aref (get vm :memory) address))

(defun set-memory (vm address value)
  (setf (aref (get vm :memory) address) value))

(defun move (vm from to)
  (set-register vm to (get-register vm from)))

(defun move-im (vm value to)
  (set-register vm to value))

(defun vm-load (vm address register)
  (set-register vm register (get-memory vm address)))

(defun vm-store (vm address register)
  (set-memory vm address (get-register vm register)))

(defun vm-store-im (vm address value)
  (set-memory vm address value))

(defun vm-push (vm register)
  (increment vm :SP)
  (vm-store vm (get-register vm :SP) register))

(defun vm-push-im (vm value)
  (increment vm :SP)
  (vm-store-im vm (get-register vm :SP) value))

(defun vm-pop (vm register)
  (vm-load vm (get-register vm :SP) register)
  (decrement vm :SP))

(defun vm-add (vm src dst)
  (set-register vm dst (+ (get-register vm dst) (get-register vm src))))

(defun vm-sub (vm src dst)
  (set-register vm dst (- (get-register vm dst) (get-register vm src))))

(defun vm-mul (vm src dst)
  (set-register vm dst (* (get-register vm dst) (get-register vm src))))

(defun vm-div (vm src dst)
  (set-register vm dst (/ (get-register vm dst) (get-register vm src))))

(defun vm-add-im (vm value dst)
  (set-register vm dst (+ (get-register vm dst) value)))

(defun vm-sub-im (vm value dst)
  (set-register vm dst (- (get-register vm dst) value)))

(defun vm-mul-im (vm value dst)
  (set-register vm dst (* (get-register vm dst) value)))

(defun vm-div-im (vm value dst)
  (set-register vm dst (/ (get-register vm dst) value)))

(defun vm-cons (vm src dst)
  (set-register vm dst (cons (get-register dst src) (get-register vm dst))))

(defun vm-car (vm register)
  (set-register vm register (car (get-register vm register))))

(defun vm-cdr (vm register)
  (set-register vm register (cdr (get-register vm register))))

(defun increment (vm register)
  (set-register vm register (+ (get-register vm register) 1)))

(defun decrement (vm register)
  (set-register vm register (- (get-register vm register) 1)))

(defun vm-jump (vm label)
  (set-register vm :PC label))

(defun vm-jump-return (vm label)
  (vm-push vm :PC)
  (vm-jump vm label))

(defun vm-return (vm)
  ((lambda (address)
    (set-register vm :PC address)
    (vm-jump vm address))
    (progn
      (vm-pop vm :INTERNAL)
      (get-register vm :INTERNAL))))

(defun vm-lisp-function (vm name)
  (labels (
    (add-argument (parameters remaining)
      (if (< 0 remaining)
        (add-argument (append parameters (list (get-memory vm
            (- (get-register vm :FP) remaining)))) (- remaining 1))
        (progn parameters (print "params") (print parameters))
      )))
      (set-register vm :R0 (apply name (add-argument nil (get-memory vm (get-register vm :FP)))))))

(defun vm-compare (vm left right)
  (vm-compare-im vm (get-register vm left) right))

(defun vm-compare-equality (vm left right)
  ((lambda (left-value right-value)
    (set-register vm :FEQ (equal left-value right-value)))
    (get-register vm left)
    (get-register vm right)))

(defun vm-compare-im (vm value right)
  ((lambda (left-value right-value)
    (set-register vm :FLT (< left-value right-value))
    (set-register vm :FEQ (= left-value right-value))
    (set-register vm :FGT (> left-value right-value)))
  value
  (get-register vm right)))

(defun vm-jump-gt (vm label)
 (if (get-register vm :FGT)
   (vm-jump vm label)))

 (defun vm-jump-eq (vm label)
  (if (get-register vm :FEQ)
    (vm-jump vm label)))

(defun vm-jump-lt (vm label)
 (if (get-register vm :FLT)
   (vm-jump vm label)))

(defun vm-jump-geq (vm label)
  (if (or (get-register vm :FGT) (get-register vm :FEQ))
    (vm-jump vm label)))

(defun vm-jump-leq (vm label)
  (if (or (get-register vm :FLT) (get-register vm :FEQ))
    (vm-jump vm label)))

(defun vm-jump-neq (vm label)
  (if (or (get-register vm :FGT) (get-register vm :FLT))
    (vm-jump vm label)))

(defun vm-run (vm)
  (setf halt? nil)
  (loop while (not halt?) do
    ;(print (get-register vm :SP))
    ;(print (get-register vm :PC))
    ;(print (get-register vm :FP))
    ;(print (get-memory vm (get-register vm :FP)))
    ;(print (get-memory vm (get-register vm :PC)))
    (if (or
      (equal (car (get-memory vm (get-register vm :PC))) :JSR)
      (equal (car (get-memory vm (get-register vm :PC))) :LSPFN))
      (print (get-memory vm (get-register vm :PC))))
    (vm-run-instruction vm (get-memory vm (get-register vm :PC)))
    (increment vm :PC)))

(defun vm-run-instruction (vm instruction)
  (case (car instruction)
    (:MOVE
      (if (atom (car (cdr instruction)))
        (move vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (move-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          ;we could be storing a tree in the register
          (move vm (car (cdr instruction)) (car (cdr (cdr instruction)))))))
    (:LOAD
      (vm-load vm (get-register vm (car (cdr instruction))) (car (cdr (cdr instruction)))))
    (:STORE
      (vm-store vm (get-register vm (car (cdr (cdr instruction)))) (car (cdr instruction))))
    (:INCR
      (increment vm (car (cdr instruction))))
    (:DECR
      (decrement vm (car (cdr instruction))))
    (:ADD
      (if (atom (car (cdr instruction)))
        (vm-add vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-add-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          (warn "incompatible type for arithmetic operation"))))
    (:MULT
      (if (atom (car (cdr instruction)))
        (vm-mul vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-mul-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          (warn "incompatible type for arithmetic operation"))))
    (:SUB
      (if (atom (car (cdr instruction)))
        (vm-sub vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-sub-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          (warn "incompatible type for arithmetic operation"))))
    (:DIV
      (if (atom (car (cdr instruction)))
        (vm-div vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-div-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          (warn "incompatible type for arithmetic operation"))))
    (:PUSH
      (if (atom (car (cdr instruction)))
        (vm-push vm (car (cdr instruction)))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-push-im vm (car (cdr (car (cdr instruction)))))
          (warn "incompatible type for arithmetic operation"))))
    (:POP
      (vm-pop vm (car (cdr instruction))))
    (:CMP
      (if (atom (car (cdr instruction)))
        (vm-compare vm (car (cdr instruction)) (car (cdr (cdr instruction))))
        (if (equal (car (car (cdr instruction))) :CONST)
          (vm-compare-im vm (car (cdr (car (cdr instruction)))) (car (cdr (cdr instruction))))
          (warn "incompatible type for comparison operation"))))
    (:CMPE
      (vm-compare-equality vm (car (cdr instruction)) (car (cdr (cdr instruction)))))
    (:JGT
      (vm-jump-gt vm (car (cdr instruction))))
    (:JEQ
      (vm-jump-eq vm (car (cdr instruction))))
    (:JLT
      (vm-jump-lt vm (car (cdr instruction))))
    (:JGE
      (vm-jump-geq vm (car (cdr instruction))))
    (:JLE
      (vm-jump-leq vm (car (cdr instruction))))
    (:JNE
      (vm-jump-neq vm (car (cdr instruction))))
    (:JMP
      (vm-jump vm (car (cdr instruction))))
    (:JSR
      (vm-jump-return vm (car (cdr instruction))))
    (:RTN
      (vm-return vm))
    (:NOP
      nil)
    (:LABEL
      nil)
    (:HALT
      (setf halt? T))
    (:CONS
      (vm-cons vm (car (cdr instruction)) (car (cdr (cdr instruction)))))
    (:CAR
      (vm-car vm (car (cdr instruction))))
    (:CDR
      (vm-cdr vm (car (cdr instruction))))
    (:LSPFN
      (vm-lisp-function vm (car (cdr instruction))))))
