(defn error-message
  [severity]
  (str "OH GOD! IT'S A DISASTER WE'RE "
       (if (= severity :mild)
         "MILDLY INCONVENIENCED!"
         "DOOOOOOOOOOOMED!")))