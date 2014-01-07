;; Maps in clojure
(ns maps)

;; map example 1
{:a 1
 :b "nice example"
 :c []}


;; map example 2
{:name {:first "John" :middle "Brad" :last "Wanstrath"}}

;; You can look up maps like below

;; ;; returns 1
(get {:a 0 :b 1} :b)


;; returns rad

(get {:a 0 :b 1 :c "rad"} :c)

