package io.github.nbobhate.patterns.creational.factory;

public class InternationalRateCalculator extends RateCalculator {

    public AirtimePlan getAirtimePlan() {
        return new InternationalAirtimePlan();
    }
}
