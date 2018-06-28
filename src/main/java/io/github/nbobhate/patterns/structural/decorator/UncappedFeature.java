package io.github.nbobhate.patterns.structural.decorator;

public class UncappedFeature extends Feature {

    private DataPlan dataPlan;

    public UncappedFeature(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
    }

    @Override
    public double getCost() {
        return 6.00 + dataPlan.getCost();
    }

    public String getDescription() {
        return dataPlan.getDescription() + ", Uncapped line";
    }
}
