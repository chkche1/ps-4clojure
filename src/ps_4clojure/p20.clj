(ns ps-4clojure.p20
  (:use clojure.test))

(defn __ [xs]
  ((comp second reverse) xs)
)

(defn -main []
  (are [soln] soln
  (= (__ (list 1 2 3 4 5)) 4)
  (= (__ ["a" "b" "c"]) "b")
  (= (__ [[1 2] [3 4]]) [1 2])
))