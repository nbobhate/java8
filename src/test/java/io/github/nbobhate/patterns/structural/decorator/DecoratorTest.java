package io.github.nbobhate.patterns.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void test() {
        DataPlan basicDataPlan = new BasicDataPlan();
        assertEquals(10.00, basicDataPlan.getCost(), 0.0);
        assertEquals("Basic Data Plan", basicDataPlan.getDescription());

        DataPlan cappedPlan = new BasicDataPlan();
        cappedPlan = new CappedFeature(cappedPlan);
        assertEquals(15.00, cappedPlan.getCost(), 0.0);
        assertEquals("Basic Data Plan, Capped line", cappedPlan.getDescription());

        DataPlan uncappedVoipPlan = new BasicDataPlan();
        uncappedVoipPlan = new UncappedFeature(uncappedVoipPlan);
        uncappedVoipPlan = new VoIPFeature(uncappedVoipPlan);
        assertEquals(23.00, uncappedVoipPlan.getCost(), 0.0);
        assertEquals("Basic Data Plan, Uncapped line, Voice", uncappedVoipPlan.getDescription());
    }
}
