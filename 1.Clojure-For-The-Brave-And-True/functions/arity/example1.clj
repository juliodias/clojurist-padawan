(defn no-arity []
  (println "No arity function!"))

(defn one-arity [message]
  (println message))

(defn two-arity [message name]
  (println message "," name))

(defn mult-arity
  ([] "This is unnecessary :p")
  ([message] (one-arity message))
  ([message name] (two-arity message name)))
