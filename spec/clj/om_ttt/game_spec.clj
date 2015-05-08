(ns om-ttt.game-spec
  (:require [om-ttt.game :refer :all]
            [om-ttt.rules :as r]
            [om-ttt.players.ai :refer [new-ai-player]]
            [om-ttt.players.human :refer [new-human-player]]
            [om-ttt.mock-ui :refer [new-mock-ui]]
            [om-ttt.protocols.ui :as ui]
            [om-ttt.spec-helper :refer :all]
            [speclj.core :refer :all]))

(def ai-token "X")
(def human-token "O")
(def config {:first-player "ai" :ai-token ai-token :human-token human-token :board-size 3})
(def ai-player (new-ai-player ai-token human-token))
(def mock-ui (new-mock-ui config))
(def mock-human-player (new-human-player human-token mock-ui))

(describe "game"
  (it "plays several games all the way through"
    (should= ai-token (r/winner (start-game ai-player mock-human-player mock-ui)))))