package io.github.nbobhate.patterns.creational.abstractfactory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class AbstractFactoryTest {

    @Test
    public void test() {
        FurnitureFactory furnitureFactory = Manufacturer.getFactory(FurnitureType.DINING);
        assertNotNull(furnitureFactory);

        Table diningTable = furnitureFactory.createTable();
        Chair diningChair = furnitureFactory.createChair();

        diningTable.create();
        diningChair.create();


        furnitureFactory = Manufacturer.getFactory(FurnitureType.PATIO);
        assertNotNull(furnitureFactory);

        Table patioTable = furnitureFactory.createTable();
        Chair patioChair = furnitureFactory.createChair();

        patioTable.create();
        patioChair.create();
    }
}
