(defproject clojurebyexample "0.1.0-SNAPSHOT"
 :description "FIXME: write description"
 :url "http://example.com/FIXME"
 :license {:name "Eclipse Public License"
 :url "http://www.eclipse.org/legal/epl-v10.html"}
 :plugins [[lein-marginalia "0.8.0"] [lein-ring "0.9.1"] [compojure "1.3.1"]]
 :min-lein-version "2.0.0"
 :resource-paths ["resources"] ;
 :ring {:handler clojurebyexample.core/app  }
 :dependencies [[org.clojure/clojure "1.6.0"] 
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]]
 :main clojurebyexample.core)
