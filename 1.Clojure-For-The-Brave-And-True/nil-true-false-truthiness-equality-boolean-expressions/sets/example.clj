(comment
  1. Sets can be hash set or sorted set)

#{1 2 3}                                                    ; #{1 2 3}
#{1 2 3 3 4 4}                                              ; Duplicate key: 3
(hash-set "J" "u" "l" "i" "o")                              ; #{"J" "i" "l" "u" "o"}
(hash-set "A" "A")                                          ; #{"A"}

; Retrieve elements
(get #{1 2} 0)                                              ; nil
(get #{"Julio" "Dias"} "Julio")                             ; "Julio"

; Add elements
(conj #{1 2 3} 4)                                           ; #{1 4 3 2}
(conj #{1 2 3} 3)                                           ; #{1 3 2}

; Create set from vectors, lists.
(set [1 2 3 4])                                             ; #{1 3 2 4}

; Contains
(contains? #{1 2 4} 4)                                      ; true
(contains? #{1 2} 3)                                        ; false

;(contains is the better option to check elements because it doen't return nil).
(get #{1 2 3} 4)                                            ; nil
(:a #{1 2 3})                                               ; nil