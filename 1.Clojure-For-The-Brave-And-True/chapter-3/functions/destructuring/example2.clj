(defn announce-threasure-location [{lat :lat long :long}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure long: " long)))

; (announce-threasure-location {:lat 28.22 :long 81.33 :other 30})
; Treasure lat: 28.22
;Treasure long: 81.33

; Short syntax to the example above.
(defn announce-threasure-location-short
  [{:keys [lat long]}]
  (println (str "Threasure lat: " lat))
  (println (str "Threasure long: " long)))

; Using :as to receive the full map param.
(defn receive-threasure-location
  [{:keys [lat long] :as threasure-location}]
  (println (str "Threasure lat: " lat))
  (println (str "Threasure long: " long))
  (println (str "Threasure location: " threasure-location)))

;(receive-threasure-location {:lat 20.20 :long 100.203 :other 203.10})
;Threasure lat: 20.2
;Threasure long: 100.203
;Threasure location: {:lat 20.2, :long 100.203, :other 203.1}