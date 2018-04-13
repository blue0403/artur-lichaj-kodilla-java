package com.kodilla.good.patterns.food2door;

public class OrderStatusValidator {
    private Supplier supplier;

    public OrderStatusValidator(final Supplier supplier) {
        this.supplier = supplier;
    }

    public ProductOrderDTO checkOrderStatus(final ProductOrderRequest productOrderRequest) {
        boolean isOrdered = supplier.process(productOrderRequest);

        if (isOrdered) {
            return  new ProductOrderDTO(supplier, true);
        } else {
            return new ProductOrderDTO(supplier, false);
        }
    }
}
