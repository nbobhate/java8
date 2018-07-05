package io.github.nbobhate.patterns.structural.facade;

public class NasaGroundControlImpl implements NasaGroundControl {

    @Override
    public void initializeTMinus_0() {
        CountdownSequence t = new TMinus0();
        t.initialize();
    }

    @Override
    public void initializeTMinus_9_AndCounting() {
        CountdownSequence t = new TMinus9AndCounting();
        t.initialize();
    }
}
