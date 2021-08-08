(defn first-thing [[first-thing]] first-thing)
; (first-thing ["coffee" "pizza" "water"]) -> "coffee"

(defn chooser [[first-thing second-thing & unimportant-things]] ; This destructuring is using vectors.
  (println (str "Your first important thing: " first-thing))
  (println (str "Your second important thing: " second-thing))
  (println (str "The rest of the important things: " (clojure.string/join ", " unimportant-things))))

; (chooser ["coffee" "pizza" "run" "diet" "sleep"])
; Your first important thing: coffee
; Your second important thing: pizza
; The rest of the important things: run, diet, sleep