(ns ps-4clojure.p28
  (:use clojure.test))

;; coll? vs sequential? vs seq?
;; http://stackoverflow.com/questions/22439174/what-is-the-difference-between-the-functions-seq-sequential-and-coll

(def __
  #(filter (complement sequential?)
    (rest (tree-seq sequential? seq %)))
)

(defn -main []
  (are [soln] soln
  (= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
  (= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
  (= (__ '((((:a))))) '(:a))
))