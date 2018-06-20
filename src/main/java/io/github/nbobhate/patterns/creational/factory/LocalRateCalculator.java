package io.github.nbobhate.patterns.creational.factory;

public class LocalRateCalculator extends RateCalculator {

    @Override
    public AirtimePlan getAirtimePlan() {
        return new LocalAirtimePlan();
    }
}
