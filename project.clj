(defproject test-blockchain "0.1.0-SNAPSHOT"
  :description "Toy blockchain"
  :url "https://github.com/miguelpinia/toy-blockchain"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot test-blockchain.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
