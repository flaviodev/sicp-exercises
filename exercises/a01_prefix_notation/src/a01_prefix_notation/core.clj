(ns a01-prefix-notation.core
  (:gen-class))

(defn -main
  "Examples for prefix notation"
  [& args]
  (println (+ 21 35 12 7))
  (println (* 25 4 12))
  (println (+ (* 3 5) (- 10 6)))
  (println (+ (* 3 (+ (* 2 4) (+ 3 5))) (+ (- 10 7) 6))))
