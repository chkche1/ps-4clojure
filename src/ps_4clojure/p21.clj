(ns ps-4clojure.p21
  (:use clojure.test))

(defn __ [xs n]
  (if (= n 0) (first xs) (__ (rest xs) (dec n)))
)

(defn -main []
  (are [soln] soln
  (= (__ '(4 5 6 7) 2) 6)
  (= (__ [:a :b :c] 0) :a)
  (= (__ [1 2 3 4] 1) 2)
  (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
))