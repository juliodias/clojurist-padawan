(comment
  lists, maps, vectors and sets are threated as sequences,
  that's why clojure return always a list when we apply function methods to them.)

(seq [1 2 3])                                               ; (1 2 3)
(seq '(1 2 3))                                              ; (1 2 3)                                              ;
(seq #{1 2 3})                                              ; (1 2 3)
(seq {:name "Julio"})                                       ; ([:name "Julio"])

; When can convert sequences back to specific structure.
(into {} (seq {:first-name "Júlio" :last-name "Dias"}))     ; {:first-name "Júlio", :last-name "Dias"}