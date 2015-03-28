(ns ps-4clojure.p8
  (:use clojure.test)
  (:require clojure.set))

(def __
  #{:a :b :c :d}
)

(defn -main []
  (are [soln] soln
   (= __ (set '(:a :a :b :c :c :c :c :d :d)))
   (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
))