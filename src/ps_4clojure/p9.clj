(ns ps-4clojure.p9
  (:use clojure.test))

(def __
 2
)

(defn -main []
  (are [soln] soln
  (= #{1 2 3 4} (conj #{1 4 3} __))
))