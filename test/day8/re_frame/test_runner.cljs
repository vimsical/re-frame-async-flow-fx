(ns day8.re-frame.async-flow-fx.test-runner
  (:require
   [cljs.test :as cljs-test :include-macros true]
   [jx.reporter.karma :as karma :include-macros true]
   ;; Test Namespaces -------------------------------
   [day8.re-frame.async-flow-fx-test])
  (:refer-clojure :exclude (set-print-fn!)))

(enable-console-print!)

;; ---- BROWSER based tests ----------------------------------------------------
(defn ^:export set-print-fn! [f]
  (set! cljs.core.*print-fn* f))


(defn ^:export run-html-tests []
  (cljs-test/run-tests
   'day8.re-frame.async-flow-fx-test))

;; ---- KARMA  -----------------------------------------------------------------

(defn ^:export run-karma [karma]
  (karma/run-tests
   karma
   'day8.re-frame.async-flow-fx-test))
