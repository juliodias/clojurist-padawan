(comment
  1. Vectors can mix values of any type
  2. We use the same get method in maps)

(get [1 2 3] 0)                                             ; 1

(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)            ; {:name "Pugsley Winterbottom"}

(vector "creepy" "full" "moon")                             ; ["creepy" "full" "moon"]

(conj [1 2 3] 4)                                            ; [1 2 3 4] (conj add element to end of vector).