package io.github.nbobhate.patterns.structural.facade;

public class TMinus9AndCounting implements CountdownSequence {

    @Override
    public void initialize() {
        System.out.println("T-9 AC: " + startAutomaticGroundLaunchSequencer());
        System.out.println("T-9 AC: " + retractOrbiterAccessArm());
        System.out.println("T-9 AC: " + startAuxiliaryPowerUnits());
        System.out.println("T-9 AC: " + armDevices());
        System.out.println("T-9 AC: " + startProfileTests());
        System.out.println("T-9 AC: " + retractBeamieCap());
        System.out.println("T-9 AC: " + lockAndCloseVisors());
        System.out.println("T-9 AC: " + switchOrbiterToInternalPower());
        System.out.println("T-9 AC: " + signalGoForAutoSequenceStart());
        System.out.println("T-9 AC: " + activateSoundSuppressionSystem());
        System.out.println("T-9 AC: " + activateHydrogenBurnoffSystem());
        System.out.println("T-9 AC: " + startMainEngine());
    }

    private String startAutomaticGroundLaunchSequencer() {
        return "Start automatic ground launch sequencer";
    }

    private String retractOrbiterAccessArm() {
        return "Retract orbiter access arm";
    }

    private String startAuxiliaryPowerUnits() {
        return "Start auxiliary power units";
    }

    private String armDevices() {
        return "Arm solid rocket booster range safety safe and arm devices";
    }

    private String startProfileTests() {
        return "Start orbiter aerosurface profile test, followed by main engine gimbal profile test ";
    }

    private String retractBeamieCap() {
        return "Retract gaseous oxygen vent arm, or \"beanie cap\" ";
    }

    private String lockAndCloseVisors() {
        return "Crew members close and lock their visors ";
    }

    private String switchOrbiterToInternalPower() {
        return "Orbiter transfers from ground to internal power";
    }

    private String signalGoForAutoSequenceStart() {
        return "Ground launch sequencer is go for auto sequence start";
    }

    private String activateSoundSuppressionSystem() {
        return "Activate launch pad sound suppression system";
    }

    private String activateHydrogenBurnoffSystem() {
        return "Activate main engine hydrogen burnoff system";
    }

    private String startMainEngine() {
        return "Main engine start";
    }
}
