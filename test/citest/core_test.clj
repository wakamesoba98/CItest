(ns citest.core-test
  (:require [clojure.test :refer :all]
            [citest.core :refer :all]
            [citest.core :as citest-core]))

(deftest a-test
  (testing "to test the output string."
    (is (= (citest-core/foo "Test") "Test, Hello World!"))))
