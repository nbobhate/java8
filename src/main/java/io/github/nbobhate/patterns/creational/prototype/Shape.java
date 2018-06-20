package io.github.nbobhate.patterns.creational.prototype;

public abstract class Shape implements Cloneable {

    protected ShapeTypes type;

    public abstract ShapeTypes getType();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
