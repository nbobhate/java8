package io.github.nbobhate.patterns.structural.decorator;

public class BasicDataPlan extends DataPlan {

    public BasicDataPlan() {
        description = "Basic Data Plan";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
