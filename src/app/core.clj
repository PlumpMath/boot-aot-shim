(ns app.core
  (:gen-class))

(defn -main [& args]
  (require 'app.core-impl)
  (apply (resolve 'app.core-impl/-main) args))
