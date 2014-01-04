(defproject clojurebyexample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-marginalia "0.7.1"] [lein-ring "0.8.8"] [compojure "1.1.6"]]
  :resource-paths ["output"] ;
  :ring {:handler clojurebyexample.core/app  }
  :dependencies [[org.clojure/clojure "1.5.1"]])
