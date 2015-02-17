(ns clojurebyexample.core
  (:require [ring.adapter.jetty :as jetty]
            [environ.core :refer [env]]
            [ring.util.response :refer [resource-response]])
  (:use ring.middleware.resource)
  (:use ring.middleware.file)
  (:use ring.middleware.file-info)
  )

(defn handler [request]
  (resource-response "toc.html", {:root "output"}))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (jetty/run-jetty  (-> #'handler (wrap-resource "output" )) {:port port :join? false})))
