(ns pivotal-tracker-api.test-client
  (:use midje.sweet)
  (:require [pivotal-tracker-api.client :as client]))
(facts "about the client"
       (fact "true is not false"
             (not true) => false))
