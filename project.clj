(defproject clojurebyexample "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-marginalia "0.8.0"][lein-ring "0.8.10"][environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :dependencies [[org.clojure/clojure "1.6.0"] 
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 ]
  :min-lein-version "2.0.0"
  :uberjar-name "clojurebyexample-standalone.jar"
  :profiles {:uberjar {:aot :all}}
  :main clojurebyexample.core)
