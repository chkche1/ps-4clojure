(ns ps-4clojure.p13
  (:use clojure.test))

(def __
  [20 30 40]
)

(defn -main []
  (are [soln] soln
  (= __ (rest [10 20 30 40]))
))