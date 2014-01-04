(ns clojurebyexample.core
  (:use ring.adapter.jetty)
  (:use ring.middleware.resource)
  (:use ring.middleware.file)
  (:use ring.middleware.file-info))

(defn handler [request]
  {:status 302
   :headers {"Location" "/toc.html"}
   })



;; wrap the handler, to be able to add middleware etc
(def app (-> #'handler (wrap-resource "output" ))) 
