(ns citest.core
  (:gen-class))

(defn foo
  "I don't do a whole lot."
  [x]
  (str x ", Hello World!"))

(defn -main 
  []
  (println (foo "Test")))
