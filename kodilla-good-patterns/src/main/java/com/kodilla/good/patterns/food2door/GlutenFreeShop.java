package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(final ProductOrderRequest productOrderRequest) {
        final String GLUTEN_FREE_SHOP = "GlutenFreeShop";
        boolean result = false;

        if (productOrderRequest != null && productOrderRequest.getSupplier().equals(GLUTEN_FREE_SHOP)) {
            System.out.println("You are making an order in GlutenFreeShop" + "\nYour order contains: "
                    + productOrderRequest.getQuantityInKG() + "kg of " + productOrderRequest.getProduct());
            result = true;
        }
        return result;
    }
}
