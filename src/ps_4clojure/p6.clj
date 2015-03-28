(ns ps-4clojure.p6
  (:use clojure.test))

(defn -main []
  (are [soln] soln
  (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
))