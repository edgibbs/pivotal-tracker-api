(ns pivotal-tracker-api.test-project
  (:use midje.sweet)
  (:require [pivotal-tracker-api.project :as project]
            [clj-http.core :as core]
            [clj-http.fake :as fake])
            )

(facts "about the project"
       ;; (fact "can fetch project"
       ;;       (project/get project_id) => {})
       (fact "true is not false"
             ;; (with-fake-routes {

             ;;                    }
               (not true) => false))
