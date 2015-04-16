(ns ps-4clojure.p29
  (:use clojure.test))

(def __
  #(apply str (re-seq #"[A-Z]+" %))
)

(defn -main []
  (are [soln] soln
  (= (__ "HeLlO, WoRlD!") "HLOWRD")
  (empty? (__ "nothing"))
  (= (__ "$#A(*&987Zf") "AZ")
))
