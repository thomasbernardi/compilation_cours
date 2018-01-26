(defun load-lisp (file-in)
  (labels
    ((read-stream (stream expr-list)
      (if (listen stream)
        (read-stream stream
          ((lambda (expr)
            (if (null expr)
              expr-list
              (append expr-list (list expr))))
              (read stream nil)))
        expr-list)))
    (with-open-file (is file-in) (read-stream is nil))))

(defun write-bytecode (code file-out)
  (with-open-file (os file-out :direction :output)
    (print-object code os)))

(defun load-and-compile (file-in file-out)
  (write-bytecode (compile-expressions (load-lisp file-in)) file-out))
