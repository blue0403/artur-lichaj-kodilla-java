package com.kodilla.good.patterns.food2door;

public class OrderValidator {
    private Supplier supplier;

    public OrderValidator(final Supplier supplier) {
        this.supplier = supplier;
    }

    public ProductOrderDTO checkOrder(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = supplier.process(productOrderRequest);

        if (isOrdered) {
            return  new ProductOrderDTO(supplier, true);
        } else {
            return new ProductOrderDTO(supplier, false);
        }
    }
}
