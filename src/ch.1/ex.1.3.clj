(ns sicp)

(defn sum-of-bigger [a b c]
  (cond
    (and (< a b) (< a c)) (+ b c)
    (and (< b a) (< b c)) (+ a c)
    :else (+ a b)))

(sum-of-bigger 1 2 3)
;; => 5

(sum-of-bigger 2 1 3)
;; => 5

(sum-of-bigger 3 2 1)
;; => 5

(defn sum-of-bigger2 [a b c]
  (- (+ a b c)
     (min a b c)))

(sum-of-bigger2 1 2 3)
;; => 5

(sum-of-bigger2 2 1 3)
;; => 5

(sum-of-bigger2 3 2 1)
;; => 5
