(ns core-test
  (:require [clojure.test :refer [deftest is testing]]
            [core]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? core))))
