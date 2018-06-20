package io.github.nbobhate.patterns.creational.abstractfactory;

import io.github.nbobhate.patterns.creational.abstractfactory.dining.DiningFurnitureFactory;
import io.github.nbobhate.patterns.creational.abstractfactory.patio.PatioFurnitureFactory;

public class Manufacturer {

    public static FurnitureFactory getFactory(FurnitureType furnitureType) {
        switch (furnitureType) {
            case DINING: return new DiningFurnitureFactory();
            case PATIO: return new PatioFurnitureFactory();
            default: return null;
        }
    }
}
