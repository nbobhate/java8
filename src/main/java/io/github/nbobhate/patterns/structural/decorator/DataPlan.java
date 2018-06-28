package io.github.nbobhate.patterns.structural.decorator;

public abstract class DataPlan {

    protected String description;

    public abstract double getCost();

    public String getDescription() {
        return description;
    }
}
