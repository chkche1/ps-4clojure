(ns ps-4clojure.p11
  (:use clojure.test))

(def __
  {:b 2}
)

(defn -main []
  (are [soln] soln
  (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
))