;; (ns static-files.handler
;;   (:use compojure.core)
;;   (:require [compojure.handler :as handler]
;;             [compojure.route :as route]))

;; (def root (str (System/getProperty "user.dir") "/output"))

;; (defroutes app-routes
;;   (GET "/" [] "Hello World")
;;   (route/files "/" (do (println root) {:root root}))
;;   (route/resources "/")
;;   (route/not-found "Not Found"))

;; (def app
;;   (handler/site app-routes))
(ns clojurebyexample.core
  (:use ring.adapter.jetty)
  (:use ring.middleware.resource)
  (:use ring.middleware.file)
  (:use ring.middleware.file-info))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello Another World"})



;; wrap the handler, to be able to add middleware etc
(def app (-> #'handler (wrap-resource "" )))
