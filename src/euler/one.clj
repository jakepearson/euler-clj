(ns euler.one)

(defn multiple? [number value]
  (if (= 0 number)
    false
    (= 0 (rem value number))))

(defn multiple3or5? [value]
  (or (multiple? 3 value)
      (multiple? 5 value)))

(defn main [max]
  ;;Do the main stuff
  (reduce + (filter multiple3or5? (range 10))))

(re