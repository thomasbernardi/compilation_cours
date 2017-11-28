(defun size (tree)
  (if (atom tree)
    1
    (+
      (size (car tree))
      (size (cdr tree))
      1)))
(defun memb (x l)
  (if (eql x (car l))
    l
      (memb x (cdr l))))

(defun copytree (tree)
  (if (atom tree)
    tree
    (cons (copytree (car tree)) (copytree (cdr tree)))))

(defun sub (x y tree)
  (if (atom tree)
    (if (= tree x)
      y
      tree)
    (cons (sub x y (car tree)) (sub x y (cdr tree)))))

(defun tree-leaves (tree)
  (if (atom tree)
    (cons tree nil)
    (append (tree-leaves (car tree)) (tree-leaves (cdr tree)))))

; terminally recursive version of length
(defun len (list ret)
  (if (null list)
    ret
    (len (cdr list) (+ 1 ret))))

; fibonacci en recursion terminale
(defun fibo (m)
  (labels ((fib (n ret)
    (if (<= n 1)
      (+ ret 1)
      (fib (- n 2) (fib (- n 1) ret))))))
  (fib m 0))

; size en recursion partiellement terminale
(defun size2 (tree ret)
  (if (atom tree)
    (+ ret 1)
    (size2 (car tree) (size2 (cdr tree ) (+ ret 1)))))

(defun fact-l (n)
  (labels ((fact-t (m r)
    (if (= m 0) r
      (fact-t (- m 1)
                            (* m r)))))
          (fact-t n 1)))

; parametres optionnels et apply
(defun membr (x list &key test)
  (labels ((membr2 (x list test)
    (if (or (null list) (funcall test x (car list)))
      list
      (membr2 x (cdr list) test))))
      (membr2 x list
        (if (null test)
          'eql
          test))))

; fonction d'arité variable et APPLY
; append with apply
(defun append2 (list &rest to-append)
  (if (null to-append)
    list
    (if (null list)
      (apply #'append2 to-append)
      (cons (car list)
        (apply #'append2 (cdr list) to-append)))))

; append without apply
(defun append3 (list &rest to-append)
  (labels ((app-r (list to-append)
    (if (null to-append)
      list
      (if (atom list)
        (app-r (car to-append) (cdr to-append))
        (cons (car list)
          (app-r (cdr list) to-append))))))
    (app-r list to-append)))

; list* avec apply
(defun list2 (l &rest ll)
  (if (atom l)
    (if (null ll)
      l
      (cons l
      (apply #'list2 ll)))
    (cons (car l)
    (apply #'list2 (cdr l) ll))))

; list* sans apply
(defun list3 (l &rest ll)
  (labels ((app-r (l ll)
  (if (atom l)
    (if (null ll)
      l
      (cons l
        (app-r (car ll) (cdr ll))))
    (cons (car l)
    (app-r (cdr l) ll)))))
    (app-r l ll)))

; fonctions destructives sur les listes

(defun delete2 (x l)
  (if (atom l)
    l
    (if (eql x (car l))
      (delete2 x (cdr l))
      (progn (setf (cdr l) (delete2 x (cdr l)))
      l))))

(defun nconc2 (x l)
  (if (null l)
    x
    (progn (setf (cdr l) (nconc2 x (cdr l))) l)))


(defun nconc3 (list &rest to-append)
  (if (null to-append)
    list
    (if (null list)
      (apply #'nconc3 to-append)
      (progn (setf (cdr list)
        (apply #'nconc3 (cdr list) to-append)) list))))

(defun nreverse2 (list)
  (labels ((app-r (prev list)
    (prog1
      (if (null (cdr list))
        list
        (app-r list (cdr list)))
      (setf (cdr list) prev))))
      (app-r nil list)))

; fonctions de partage sur les listes
(defun removep (x list)
  (if (atom list)
    list
    (if (eql x (car list))
      (removep x (cdr list))
      (let ((rest (removep x (cdr list))))
        (if (eq rest (cdr list))
          list
          (cons (car list) rest))))))

(defun substp (replaced replacer list)
  (if (atom list)
    list
    (if (eql replaced (car list))
      (cons replacer (substp replaced replacer (cdr list)))
      (let ((rest (substp replaced replacer (cdr list))))
        (if (eq rest (cdr list))
          list
          (cons (car list) rest))))))

; calculette
(defun calcul1 (op a1 a2)
  (if (eql op +)
    (+ a1 a2)
    (if (eql op -)
      (- a1 a2)
      (if (eql op *)
        (* a1 a2)
        (/ a1 a2)))))

(defun calcul2 (op a1 a2)
  )
