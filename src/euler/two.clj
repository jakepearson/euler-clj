(ns euler.two
  (:require [euler.one :as one]))

(defn fibs []
  (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1])))

(defn fibs< [max]
  (take-while #(< % max) (fibs)))

(defn sum-fibs< [max]
  (reduce + (fibs< max)))

(defn sum-even-fibs< [max]
  (reduce + (filter #(one/multiple? 2 %) (fibs< max))))