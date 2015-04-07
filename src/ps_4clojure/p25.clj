(ns ps-4clojure.p25
  (:use clojure.test))

(defn __ [xs]
  (filter (fn [x] (= 1 (mod x 2))) xs) 
)

(defn -main []
  (are [soln] soln
  (= (__ #{1 2 3 4 5}) '(1 3 5))
  (= (__ [4 2 1 6]) '(1))
  (= (__ [2 2 4 6]) '())
  (= (__ [1 1 1 3]) '(1 1 1 3))
))