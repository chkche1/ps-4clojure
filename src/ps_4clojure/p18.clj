(ns ps-4clojure.p18
  (:use clojure.test))

(def __
  '(6 7)
)

(defn -main []
  (are [soln] soln
  (= __ (filter #(> % 5) '(3 4 5 6 7)))
))