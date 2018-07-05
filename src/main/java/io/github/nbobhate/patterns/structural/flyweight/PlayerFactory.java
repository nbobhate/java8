package io.github.nbobhate.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static Map<PlayerType, Player> playserMap = new HashMap<>();

    public static Player getPlayer(PlayerType playerType) {
        if (playserMap.containsKey(playerType)) {
            return playserMap.get(playerType);
        }

        Player newPlayer = new GamePlayer(playerType);
        playserMap.put(playerType, newPlayer);
        return newPlayer;
    }
}
