(ns ps-4clojure.p30
  (:use clojure.test))

(defn __
  [xs]
  (reduce #(if-not (= (last %1) %2)
             (conj %1 %2)
             %1)
          []
          xs)
)

(defn -main []
  (are [soln] soln
  (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
  (= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
  (= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
))
