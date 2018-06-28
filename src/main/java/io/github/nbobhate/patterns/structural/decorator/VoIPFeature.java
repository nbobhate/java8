package io.github.nbobhate.patterns.structural.decorator;

public class VoIPFeature extends Feature {

    private DataPlan dataPlan;

    public VoIPFeature(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
    }

    @Override
    public double getCost() {
        return 7.00 + dataPlan.getCost();
    }

    public String getDescription() {
        return dataPlan.getDescription() + ", Voice";
    }
}
