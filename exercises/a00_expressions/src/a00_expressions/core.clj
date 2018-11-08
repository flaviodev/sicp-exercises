(ns a00-expressions.core
  (:gen-class))

(defn sum [number1 number2] (println number1 " + " number2) (+ number1 number2))

(defn subtraction [number1 number2] (println number1 " - " number2) (- number1 number2))

(defn multiplication [number1 number2] (println number1 " * " number2) (* number1 number2))

(defn division [number1 number2] (println number1 " / " number2) (/ number1 number2))

(defn print-operation [operation]  (println "result -> " operation))

(defn -main
  "Expressions - pag 8"
  [& args]
  (print-operation (sum 1 5))
  (print-operation (subtraction 8 5))
  (print-operation (multiplication 4 5))
  (print-operation (division 6 2))
)