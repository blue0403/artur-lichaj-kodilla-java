package com.kodilla.good.patterns.challenges;

public class Slippers implements Product {

    @Override
    public String getProductName() {
        return "Slippers";
    }

    @Override
    public String toString() {
        return "Name of the product: " + getProductName();
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
