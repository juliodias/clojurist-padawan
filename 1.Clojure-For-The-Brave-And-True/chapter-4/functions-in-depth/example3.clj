(map inc [1 2 3])                                           ; (2 3 4)

; map function can take multiple collection arguments.
(map str ["a" "b" "c"] ["A" "B" "C"])                       ; ("aA" "bB" "cC")


(def human-consumption [8.1 7.3 6.6 5.0])
(def critter-consumption [0.0 0.2 0.3 1.1])

(defn unify-diet-data
  [human critter]
  {:human human :critter critter})

(map unify-diet-data human-consumption critter-consumption) ; ({:human 8.1, :critter 0.0} {:human 7.3, :critter 0.2} {:human 6.6, :critter 0.3} {:human 5.0, :critter 1.1})

;;
(def identities
  [{:alias "Batman" :real "Bruce Wayne"}
   {:alias "Spider-Man" :real "Peter Parker"}
   {:alias "Santa" :real "Your mom"}
   {:alias "Easter Bunny" :real "Your dad"}])

(map :real identities)                                      ; ("Bruce Wayne" "Peter Parker" "Your mom" "Your dad")                     ;