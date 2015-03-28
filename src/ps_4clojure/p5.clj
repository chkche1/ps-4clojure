(ns ps-4clojure.p5
  (:use clojure.test))

(def __
'(1 2 3 4)
)

(defn -main []
  (are [soln] soln
  (= __ (conj '(2 3 4) 1))
  (= __ (conj '(3 4) 2 1))
))