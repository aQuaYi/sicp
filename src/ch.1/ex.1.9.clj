(ns ch.1.ex.1.9)

(defn plus-a  [a b]
  (if ( = a 0)
    b
    (inc (plus-a (dec a) b))))

(plus-a 4 5)
; (inc (plus-a 3) 5)
; (inc (inc (plus-a 2 5)))
; (inc (inc (inc (plus-a 1 5))))
; (inc (inc (inc (inc (plus-a 0 5)))))
; (inc (inc (inc (inc 5))))
; (inc (inc (inc 6)))
; (inc (inc 7))
; (inc 8)
;; => 9
;; 所以，这是递归过程

(defn plus-b  [a b]
  (if (= a 0)
    b
    (plus-b (dec a) (inc b))))

(plus-b 4 5)
; (plus-b (dec 4) (inc 5))
; (plus-b 3 6)
; (plus-b (dec 3) (inc 6))
; (plus-b 2 7)
; (plus-b (dec 2) (inc 7))
; (plus-b 1 8)
; (plus-b (dec 1) (inc 8))
; (plus-b 0 9)
;; => 9
;; 所以，这是迭代过程。
