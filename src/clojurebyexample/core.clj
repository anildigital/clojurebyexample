(ns clojurebyexample.core
  (:require [ring.adapter.jetty :as jetty])
  (:use ring.middleware.resource)
  (:use ring.middleware.file)
  (:use ring.middleware.file-info)
  )

(defn handler [request]
  {:status 302
   :headers {"Location" "/toc.html"}
   })

(defn -main []
  (jetty/run-jetty (-> #'handler (wrap-resource "output" )) {:port 3005}))
