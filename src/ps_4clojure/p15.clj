(ns ps-4clojure.p15
  (:use clojure.test))

;;(defn __
;;  ([x] (* 2 x))
;;)

(def __ 
 (fn [x] (* 2 x))
 )

(defn -main []
  (are [soln] soln
  (= (__ 2) 4)
  (= (__ 3) 6)
  (= (__ 11) 22)
  (= (__ 7) 14)
))