package io.github.nbobhate.patterns.structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlyweightTest {

    @Test
    public void test() {
        Player sniperOne = PlayerFactory.getPlayer(PlayerType.SNIPER);
        assertEquals(PlayerType.SNIPER, sniperOne.getType());

        Player sniperTwo = PlayerFactory.getPlayer(PlayerType.SNIPER);
        assertEquals(sniperOne, sniperTwo);
    }

}
