(ns ch.1.ex.1.8)

(defn square [a] (* a a))

(defn good-enough? [guess x]
  (< (Math/abs (- (* guess guess guess) x)) 0.00001))

(good-enough? 3 27)

(defn improve [y x]
  (/ (+ (/ x (square y))
        (* 2 y))
     3.0))

(improve 1.0 27)

(defn cube-root [x]
  (loop [guess 1.0]
    (if (good-enough? guess x)
      guess
      (recur (improve guess x)))))

(cube-root 29)
;; => 3.0723168256867797
