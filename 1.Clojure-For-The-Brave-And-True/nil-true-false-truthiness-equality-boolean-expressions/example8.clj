(hash-map :a 1 :b 2)                                        ; {:b 2, :a 1} (Order can change)

(get {:a 1 :b 2} :a)                                        ; 1
(get {:a 1 :b 2} :c)                                        ; nil
(get {:a 1 :b 2} :c "Default value")                        ; Default value

; Get nested values in map.
(get-in {:names {:first-name "Neymar" :second-name "Lebron James"}} [:names :second-name] "No name position found!") ; Lebron James

({:name "The Human Coffeepot"} :name)                       ; The Human Coffeepot (or nil if doesn't exist.)