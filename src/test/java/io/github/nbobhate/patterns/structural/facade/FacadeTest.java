package io.github.nbobhate.patterns.structural.facade;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        NasaGroundControl groundControl = new NasaGroundControlImpl();

        groundControl.initializeTMinus_9_AndCounting();
        groundControl.initializeTMinus_0();
    }
}
