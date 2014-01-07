;; Recursion in Clojure
(ns recursion)


;; Calculates factorial of a passed number with recursionx
(defn factorial 
 [n]
 (if (== 1 n)
   n
   (* n (factorial (- n 1)
                   )
      )
   )
 )

;; Call function
(factorial 10)


;; Returns 
3628800
