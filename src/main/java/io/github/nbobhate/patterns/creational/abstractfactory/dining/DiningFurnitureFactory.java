package io.github.nbobhate.patterns.creational.abstractfactory.dining;

import io.github.nbobhate.patterns.creational.abstractfactory.Chair;
import io.github.nbobhate.patterns.creational.abstractfactory.FurnitureFactory;
import io.github.nbobhate.patterns.creational.abstractfactory.Table;

public class DiningFurnitureFactory implements FurnitureFactory {

    public Table createTable() {
        return new DiningTable();
    }

    public Chair createChair() {
        return new DiningChair();
    }
}
