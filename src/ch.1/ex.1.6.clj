(ns ch.1.ex.1.6)

(defn new-if [predicate then-clause else-clause]
  (cond predicate then-clause
        :else else-clause))

(new-if (= 2 3) 0 5)
;; => 5

(new-if (= 1 1) 0 5)
;; => 0


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
    ;; change if to new-if 
    (new-if (good-enough? guess x)
      guess
      (recur (improve guess x)))))

;; 把 if 换成 new-if 后，程序会报错
;; if 形式，是先对 predicate 进行求值，再根据结果，决定去执行 then-clause 或 else-clause
;; 普通的形式，是要把每一项**都**求值成功后，再带入函数进行计算。
;; 所以，new-if 中含有 recur 的话，会引起无限递归而报错。
