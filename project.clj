(defproject ml-hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [uncomplicate/neanderthal "0.43.3"]
                 ;;Optional. If bytedeco is not present, a system-wide MKL is used.
                 [org.bytedeco/mkl-platform-redist "2021.3-1.5.6"] ]

  :repl-options {:init-ns ml-hello.core}
  :jvm-opts ^:replace ["-Dclojure.compiler.direct-linking=true"
                       "-XX:MaxDirectMemorySize=16g" "-XX:+UseLargePages"
                       "--add-opens=java.base/jdk.internal.ref=ALL-UNNAMED"
                       "--add-opens=java.base/sun.nio.ch=ALL-UNNAMED"])
