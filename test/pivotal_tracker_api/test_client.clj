(ns pivotal-tracker-api.test-client
  (:use midje.sweet)
  (:require [pivotal-tracker-api.client :as tracker]
            [clj-http.core :as core]
            [clj-http.fake :as fake])
            )

(facts "about the client"
       (fact "true is not false"
               (not true) => false))
