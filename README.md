# texhyphclj

Clojure wrapper for Texhyphj, a Java Hyphenation library.

## Usage

```clojure
(require [texhyphclj.core :refer [create-hyphenator hyphenate]])
;; create a hyphenator using Donald E. Knuth's hyphen.tex,
;; that is included in this library.
(def my-hyphenator (create-hyphenator))
;; Or you can use custom data as file(s) and pass to create-hyphenator
;; (def my-hyphenator (create-hyphenator "some-file.tex" "other-file.tex"))
(hyphenate my-hyphenator "hyphenatar") ;; => "hy­phen­atar"
```

## License

Copyright © 2014 Hoang Minh Thang

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
