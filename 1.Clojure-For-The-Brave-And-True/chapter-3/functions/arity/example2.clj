(defn codger-communication [whippersnapper]
  (str "Get of my lawn, " whippersnapper "!!!"))

(defn codger [& whippersnapper]
  (map codger-communication whippersnapper))

;; ("Get of my lawn, Julio!!!" "Get of my lawn, Bruna!!!" "Get of my lawn, Amanda!!!")
