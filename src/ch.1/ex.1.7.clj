(ns ch.1.ex.1.7)

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

;; 执行这个程序会花费很长的时间
;; (square (sqrt 1E100))

;; 答案是错的
(square (sqrt 1.0E-10))
;; => 9.76562566601563E-4

(defn new-good-enough? [guess old-guess]
  (< (Math/abs (- (/ guess old-guess) 1.0 )) 0.00001))

(defn new-sqrt [x]
  (loop [guess 1.0 
         old-guess x]
    (if (new-good-enough? guess old-guess)
      guess
      (recur (improve guess x) guess))))


(square (new-sqrt 1.0E10))
;; => 1.0E10

(square (new-sqrt 1.0E-10))
;; => 9.999999999999998E-11
