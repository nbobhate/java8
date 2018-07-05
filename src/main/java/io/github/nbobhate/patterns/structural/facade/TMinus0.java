package io.github.nbobhate.patterns.structural.facade;

public class TMinus0 implements CountdownSequence {

    @Override
    public void initialize() {
        System.out.println("T-0: " + igniteSolidRocketBooster());
        System.out.println("T-0: " + liftoff());
    }

    private String igniteSolidRocketBooster() {
        return "Solid rocket booster ignition";
    }

    private String liftoff() {
        return "Liftoff!";
    }
}
