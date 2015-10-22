(ns redbrick-20.views.header
    (:require [reagent.core :as reagent]))

(defn render-header []
  [:header {:class "mdl-layout__header mdl-color--primary-dark"}
   [:div {:class "mdl-layout__header-row"}
    [:a {:href "#/" }
      [:span  {:class "mdl-layout-title"}
       [:img {:src "https://www.redbrick.dcu.ie/includes/images/logo-foot.png"
              :style {:width "50px" :height "50px"}}]
        " Redbrick DCU's Networking Society"]]
        [:div {:class "mdl-layout-spacer"}]
         [:nav {:class "mdl-navigation"}
           [:a {:class "mdl-navigation__link" :href "#/timeline"} "Timeline"]]]])
