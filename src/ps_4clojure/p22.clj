(ns ps-4clojure.p22
  (:use clojure.test))

; reduce
; (reduce f coll)(reduce f val coll)

(defn __ [xs]
  (reduce (fn [n x] (inc n)) 0 xs)
)

(defn -main []
  (are [soln] soln
  (= (__ '(1 2 3 3 1)) 5)
  (= (__ "Hello World") 11)
  (= (__ [[1 2] [3 4] [5 6]]) 3)
  (= (__ '(13)) 1)
  (= (__ '(:a :b :c)) 3)
))