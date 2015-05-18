(ns om-ttt.console.menu
  (:require [om-ttt.protocols.ui :as ui]
            [om-ttt.console.messages :as m]))

  (defn get-game-config [ui]
    {:ai-token (ui/input-prompt ui m/ai-token-prompt)
     :human-token (ui/input-prompt ui m/human-token-prompt)
     :board-size (ui/input-prompt ui m/board-size-prompt)
     :first-player (ui/input-prompt ui m/first-player-prompt)})
