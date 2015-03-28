(ns ps-4clojure.p3
  (:use clojure.test))

(def __
"HELLO WORLD"
 )

(defn -main []
  (are [soln] soln
(= __ (.toUpperCase "hello world"))
))