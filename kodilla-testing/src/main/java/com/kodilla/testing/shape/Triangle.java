package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Integer getField() {
        return 21;
    }

    @Override
    public String toString() {
        return "Name of the shape: " + getShapeName() + "\nThe surface area of a shape: " + getField();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
