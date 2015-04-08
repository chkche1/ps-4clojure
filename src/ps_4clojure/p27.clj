(ns ps-4clojure.p27
  (:use clojure.test))

;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;(def __ 
;  #(= % (reverse %))
;)
(def __
  #(= (seq %) (reverse %))
)

(defn -main []
  (are [soln] soln
  (false? (__ '(1 2 3 4 5)))
  (true? (__ "racecar"))
  (true? (__ [:foo :bar :foo]))
  (true? (__ '(1 1 3 3 1 1)))
  (false? (__ '(:a :b :c)))
))