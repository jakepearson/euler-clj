(ns euler.one-test
  (:use [expectations])
  (:require [euler.one :as e]
            [clojure.core :as co]))

;; multiple
(expect true (e/multiple? 3 3))
(expect false (e/multiple? 3 2))
(expect false (e/multiple? 0 3))

;; multiple 3 or 5
(expect true (e/multiple3or5? 3))

;; euler1
(expect 23 (e/main 10))

(expect (e/multiple? 3 3))
(expect (e/multiple? 3 3))
