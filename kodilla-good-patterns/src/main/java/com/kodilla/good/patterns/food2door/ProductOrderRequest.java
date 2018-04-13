package com.kodilla.good.patterns.food2door;

public class ProductOrderRequest {
    private String supplier;
    private double quantityInKG;
    private String product;

    public ProductOrderRequest(final String supplier, final double quantityInKG, final String product) {
        this.supplier = supplier;
        this.quantityInKG = quantityInKG;
        this.product = product;
    }

    public String getSupplier() {
        return supplier;
    }

    public double getQuantityInKG() {
        return quantityInKG;
    }

    public String getProduct() {
        return product;
    }
}
