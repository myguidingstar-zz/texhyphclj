(ns texhyphclj.core
  (:require [clojure.java.io :refer [resource input-stream]])
  (:import [net.davidashen.text Hyphenator]))

(defn create-hyphenator
  "Create a hyphenator with a table file. If no file is specified, the default
 Donald E. Knuth's hyphen.tex, that is included in this library, is used instead."
  ([& table-files]
     (let [hyp (Hyphenator.)
           table-files (if (zero? (count table-files))
                         [(input-stream (resource "hyphen.tex"))]
                         table-files)]
       (doseq [f table-files]
         (.loadTable hyp f))
       hyp)))

(defn hyphenate
  "Hyphenates a word using a given hyphenator."
  [hyphenator word]
  (.hyphenate hyphenator word))
