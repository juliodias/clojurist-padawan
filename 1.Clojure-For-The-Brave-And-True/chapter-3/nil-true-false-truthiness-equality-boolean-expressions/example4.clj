(comment
  OR -> First true value or last value.
  AND -> First false value or if no false value, last true value.)

(or false nil :large_I_mean_venti :why_cant_I_just_say_large) ; :large_I_mean_venti

(or (= 0 1) (= "yes" "no"))                                 ; false

(or nil)                                                    ; nil