(ns angular-seed-clj.core.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.adapter.jetty :refer [run-jetty]]))

(defn index-page []
  (->
    (resp/resource-response "index.html" {:root "public"})
    (resp/header "Content-Type" "text/html; charset=UTF-8")))

(defroutes app-routes
  (GET "/" [] (index-page))
  (GET "*" [] (index-page))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))

(defonce server (run-jetty #'app {:port 8080 :join? false}))
