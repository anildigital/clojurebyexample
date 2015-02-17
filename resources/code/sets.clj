(ns sets)

;; Literal 
#{"humpty dumpty" "sat on" 20 40}


;; If you try to add :b into a set which already has :b
;; Then return set will only have one :b
;; Returns #{:a :b}
(conj #{:a :b} :b)



;; Check whether value exists or not in the set
(get #{:a :b} :a)


