(set-env!
  :resource-paths #{"src"}
  :dependencies   '[[org.clojure/clojure "1.8.0"]])

(task-options!
  sift {:include #{#"\.jar$"}}
  aot  {:namespace #{'app.core}}
  jar  {:main 'app.core :file "app.jar"})

(deftask build
  []
  (comp (aot)
        (uber)
        (jar)
        (sift)
        (target)))
