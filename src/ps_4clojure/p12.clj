(ns ps-4clojure.p12
  (:use clojure.test))

(def __
  3
)

(defn -main []
  (are [soln] soln
  (= __ (first '(3 2 1)))
  (= __ (second [2 3 4]))
  (= __ (last (list 1 2 3)))
))