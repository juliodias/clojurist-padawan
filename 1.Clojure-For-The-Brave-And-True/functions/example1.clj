; Basic functions
(+ 1 2 3)                                                   ; 6
(* 1 2 3)                                                   ; 8
(first [10 50 200])                                         ; 10
(last [10 50 300])                                         ; 300

; Functions can be returned
(or + -)                                                    ; #object[clojure.core$_PLUS_ 0x2ad59efe "clojure.core$_PLUS_@2ad59efe"]
((or + -) 1 2 4)                                            ; 7
((and (= 1 1) +) 1 2 3)                                     ; 6
((first [+ 0]) 3 3)                                         ; 6