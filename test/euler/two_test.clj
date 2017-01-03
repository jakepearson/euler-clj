(ns euler.two-test
  (:use [expectations])
  (:require [euler.two :as e]))

;; Fibs
(expect `(0 1 1 2 3) (take 5 (e/fibs)))

;; Fibs<
(expect `(0 1 1 2 3) (e/fibs< 4))

;; sub-fibs<
(expect 7 (e/sum-fibs< 4))


;; sub-even-fibs<
(expect 2 (e/sum-even-fibs< 4))
(expect 10 (e/sum-even-fibs< 9))
(expect 10 (e/sum-even-fibs< 4000000))