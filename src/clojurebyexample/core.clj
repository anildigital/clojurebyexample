(ns clojurebyexample.core
  (:require [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]])
  (:use ring.middleware.resource)
  (:use ring.middleware.file)
  (:use ring.middleware.file-info)
  )

(defn handler [request]
  {:status 302
   :headers {"Location" "/toc.html"}
   })

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty  (-> #'handler (wrap-resource "output" )) {:port port :join? false})))
