(defproject clojurebyexample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-marginalia "0.8.0"] [lein-ring "0.9.1"] [compojure "1.3.1"]]
  :resource-paths ["resources"] ;
  :min-lein-version "2.0.0"
  :ring {:handler clojurebyexample.core/app  }
  :dependencies [[org.clojure/clojure "1.6.0"]])
