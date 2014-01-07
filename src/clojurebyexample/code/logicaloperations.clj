;; Logical operations
(ns logicaloperations)


;; Function which uses logical operators
(defn logical [a b] 
  (prn (str "a and b is " (and a b)))
  (prn (str "a or b is " (or a b)))
  (prn (str "not a is "  (not a))))
 

;; Call function
(logical true false)

;; Returns

;; "a and b is false" 
;; "a or b is true"
;; "not a is false"
