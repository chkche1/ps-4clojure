(ns ps-4clojure.p16
  (:use clojure.test))

(defn __ [x]
  (str "Hello, " x "!")
 )

(defn -main []
  (are [soln] soln
  (= (__ "Dave") "Hello, Dave!")
  (= (__ "Jenn") "Hello, Jenn!")
  (= (__ "Rhea") "Hello, Rhea!")
))