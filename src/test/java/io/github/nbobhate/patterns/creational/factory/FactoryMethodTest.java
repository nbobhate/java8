package io.github.nbobhate.patterns.creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryMethodTest {

    @Test
    public void test() {
        final double minutes = 5;

        RateCalculator localRateCalculator = new LocalRateCalculator();
        double localCost = localRateCalculator.calculateCost(minutes);
        assertEquals(2.5, localCost, 0.0);

        RateCalculator internationalRateCalculator = new InternationalRateCalculator();
        double internationalCost = internationalRateCalculator.calculateCost(minutes);
        assertEquals(6.0, internationalCost, 0.0);
    }
}
