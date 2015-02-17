(ns keywords)

;; keywords are like

:a 
:rumbleball
:34
:_?


;; keywords can be used as functions

;; Returns rad
(:c {:a 1 :b 2 :c "rad" :d 4})


;; This is equivalent to 
({:a 1 :b 2 :c "rad" :d 4} :c)

