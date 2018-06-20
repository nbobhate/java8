package io.github.nbobhate.patterns.creational.prototype;

public class Circle extends Shape {

    public Circle() {
        this.type = ShapeTypes.CIRCLE;
    }

    @Override
    public ShapeTypes getType() {
        return type;
    }
}
