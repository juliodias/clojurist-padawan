(defn dec-maker
  "Custom decrement"
  [decrement-by]
  #(- % decrement-by))