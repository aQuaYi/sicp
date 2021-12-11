(ns sicp)

(defn square [a] (* a a))

(defn good-enough? [guess x]
  (< (Math/abs (- (square guess) x)) 0.001))

(defn average [a b]
  (/ (+ a b) 2))

(defn improve [guess x]
  (average guess
           (/ x guess)))

(defn sqrt [x]
  (loop [guess 1.0]
    (if (good-enough? guess x)
      guess
      (recur (improve guess x)))))

(sqrt 9)
;; => 3.00009155413138

(sqrt (+ 100 37))
;; => 11.704699917758145

(sqrt (+ (sqrt 2) (sqrt 3)))
;; => 1.7739279023207892

(square (sqrt 1000))
;; => 1000.000369924366
