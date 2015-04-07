(ns ps-4clojure.p24
  (:use clojure.test))

(defn __ [xs]
  (reduce + xs)
)

(defn -main []
  (are [soln] soln
  (= (__ [1 2 3]) 6)
  (= (__ (list 0 -2 5 5)) 8)
  (= (__ #{4 2 1}) 7)
  (= (__ '(0 0 -1)) -1)
  (= (__ '(1 10 3)) 14)
))