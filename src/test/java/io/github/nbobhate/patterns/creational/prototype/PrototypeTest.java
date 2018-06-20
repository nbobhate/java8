package io.github.nbobhate.patterns.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Shape circle1 = ShapeCache.getShape(ShapeTypes.CIRCLE);
        Shape circle2 = ShapeCache.getShape(ShapeTypes.CIRCLE);

        assertNotNull(circle1);
        assertNotNull(circle2);

        assertNotEquals(circle1, circle2);
        assertEquals(circle1.getType(), circle2.getType());
    }
}
