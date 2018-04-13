package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Supplier {

    @Override
    public boolean process(final ProductOrderRequest productOrderRequest) {
        final String HEALTHY_SHOP = "HealthyShop";
        boolean result = false;

        if (productOrderRequest != null && productOrderRequest.getSupplier().equals(HEALTHY_SHOP)) {
            System.out.println("You are making an order in HealthyShop" + "\nYour order contains: "
                    + productOrderRequest.getQuantityInKG() + "kg of " + productOrderRequest.getProduct());
            result = true;
        }
        return result;
    }
}
