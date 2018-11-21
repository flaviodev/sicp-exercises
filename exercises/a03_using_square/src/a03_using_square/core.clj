(ns a03-using-square.core
  (:gen-class))

(defn exp [x n]
     (if (zero? n) 1
         (* x (exp x (dec n)))))

(defn square [x] (exp x 2))

(defn -main
  "Implementing recursion"
  [& args]

  (println (square 3))
)
