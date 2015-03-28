(ns ps-4clojure.p10
  (:use clojure.test))

(def __
  (:b {:a 10, :b 20, :c 30})
)

(defn -main []
  (are [soln] soln
  (= __ ((hash-map :a 10, :b 20, :c 30) :b))
  (= __ (:b {:a 10, :b 20, :c 30}))
))