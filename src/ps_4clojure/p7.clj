(ns ps-4clojure.p7
  (:use clojure.test))

(def __
  [1 2 3 4]
)

(defn -main []
  (are [soln] soln
  (= __ (conj [1 2 3] 4))
  (= __ (conj [1 2] 3 4))
))