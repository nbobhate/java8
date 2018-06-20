package io.github.nbobhate.patterns.creational.abstractfactory.patio;

import io.github.nbobhate.patterns.creational.abstractfactory.Chair;
import io.github.nbobhate.patterns.creational.abstractfactory.FurnitureFactory;
import io.github.nbobhate.patterns.creational.abstractfactory.Table;

public class PatioFurnitureFactory implements FurnitureFactory {

    public Table createTable() {
        return new PatioTable();
    }

    public Chair createChair() {
        return new PatioChair();
    }
}
