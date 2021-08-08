(comment
  1. List can't use get method to retrieve objects.
  2. In lists, conj method add the value in the beggining.
  3. Lists can be slower than vectors when retrieve objects because it traverse the list instead use index position.
  4. contains? not work with lists.)

'(1 2 3 4)                                                  ; (1 2 3 4)
'(1 :a "Hello world")                                       ; (1 :a "Hello world") (Allowed mix different objects.)
(list "hello" "world")                                      ; ("hello" "world")

; Retrieve element
(nth '(1 2 3) 1)                                            ; 2
(nth (list 1 2 3) 4)                                  ;  (IndexOutOfBoundsException) null
(get (list 1 2 3) 1)                                        ; nil (get can't be used but not throw exception)

; Add element
(conj '("World") "Hello")                                   ; ("Hello" "World")