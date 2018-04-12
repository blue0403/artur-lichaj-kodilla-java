package com.kodilla.good.patterns.challenges;

public class Game implements Product {

    @Override
    public String getProductName() {
        return "Game";
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
