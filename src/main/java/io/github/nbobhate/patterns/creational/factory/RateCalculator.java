package io.github.nbobhate.patterns.creational.factory;

public abstract class RateCalculator {

    public abstract AirtimePlan getAirtimePlan();

    public final double calculateCost(double minutes) {
        AirtimePlan plan = getAirtimePlan();
        return plan.getRate() * minutes;
    }
}
