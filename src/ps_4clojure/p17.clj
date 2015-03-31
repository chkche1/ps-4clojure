(ns ps-4clojure.p17
  (:use clojure.test))

(def __
  '(6 7 8)
)

(defn -main []
  (are [soln] soln
  (= __ (map #(+ % 5) '(1 2 3)))
))