package io.github.nbobhate.patterns.structural.decorator;

public class CappedFeature extends Feature {

    private DataPlan dataPlan;

    public CappedFeature(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
    }

    @Override
    public double getCost() {
        return 5.00 + dataPlan.getCost();
    }

    public String getDescription() {
        return dataPlan.getDescription() + ", Capped line";
    }
}
