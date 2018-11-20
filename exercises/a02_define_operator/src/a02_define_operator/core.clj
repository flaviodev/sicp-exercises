(ns a02-define-operator.core
  (:gen-class))


(defn -main
  "Using define operator - in clojure use def"
  [& args]
  (def size 2)
  (println size)
  (println (* size 2))

  (def pi 3.14159)
  (def radius 10)
  (println (* pi (* radius radius))) ;314.159
  (def circumference (* 2 pi radius))
  (println circumference) ;62.8318


)
