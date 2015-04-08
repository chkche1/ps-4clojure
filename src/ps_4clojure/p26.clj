(ns ps-4clojure.p26
  (:use clojure.test))

(defn __ [n]
  (map first (take n (iterate (fn [[x y]] [y (+ x y)]) [1 1])))
)

(defn -main []
  (are [soln] soln
  (= (__ 3) '(1 1 2))
  (= (__ 6) '(1 1 2 3 5 8))
  (= (__ 8) '(1 1 2 3 5 8 13 21))
))