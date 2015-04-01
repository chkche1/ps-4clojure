(ns ps-4clojure.p19
  (:use clojure.test))

(defn __ [x]
  (nth x (- (count x) 1))
)

(defn -main []
  (are [soln] soln
  (= (__ [1 2 3 4 5]) 5)
  (= (__ '(5 4 3)) 3)
  (= (__ ["b" "c" "d"]) "d")
))