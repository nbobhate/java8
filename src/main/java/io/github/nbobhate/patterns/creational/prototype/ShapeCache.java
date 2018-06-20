package io.github.nbobhate.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<ShapeTypes, Shape> cache;

    static {
        cache = new HashMap<ShapeTypes, Shape>();

        cache.put(ShapeTypes.CIRCLE, new Circle());
    }

    public static Shape getShape(ShapeTypes type) throws CloneNotSupportedException {
        return (Shape) cache.get(type).clone();
    }
}
