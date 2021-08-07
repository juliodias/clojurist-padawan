(comment
  1. We can mix fixed parameters with rest parameters, but the rest parameters must be the last parameter.)

(defn favorite-things [name & things]
  (str "Hello, " name " here are my favorite things: "
    (clojure.string/join ", " things)))

; (favorite-things "Julio" "coffee" "books" "run") ->  "Hello, Julio here are my favorite things: coffee, books, run"