(ns cljs-counter.core
  (:require [reagent.core :as r]))

(defonce state (r/atom {:model 0}))

(defn increment []
  (swap! state update :model inc))

(defn decrement []
  (swap! state update :model dec))

(defn main []
  [:div
   [:button {:on-click decrement} "-"]
   [:div (:model @state)]
   [:button {:on-click increment} "+"]])

(r/render [main] (.getElementById js/document "app"))
