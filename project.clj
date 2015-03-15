(defproject pivotal-tracker-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "1.0.1"]]
  :profiles {:dev {:dependencies [[midje "1.6.3" :exclusions [org.clojure/clojure]]
                                  [clj-http-fake "1.0.1"]]
                   :plugins [[lein-midje "3.1.3"]]}})
