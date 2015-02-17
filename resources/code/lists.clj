(ns lists)

;; List 
'(1 2 3 4)

;; Doesn't work for lists
(get '(100 200 300 400) 3)


;; This will return 400
(nth '(100 200 300 400) 3)
