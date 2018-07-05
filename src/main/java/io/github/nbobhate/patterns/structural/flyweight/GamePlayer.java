package io.github.nbobhate.patterns.structural.flyweight;

public class GamePlayer implements Player {

    private PlayerType type;

    public GamePlayer(PlayerType type) {
        this.type = type;
    }

    public PlayerType getType() {
        return type;
    }
}
