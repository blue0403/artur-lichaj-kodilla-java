package com.kodilla.good.patterns.food2door;

public class ProductOrderDTO {
    private Supplier supplier;
    private boolean isOrdered;

    public ProductOrderDTO(final Supplier supplier, final boolean isOrdered) {
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
