package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier {

    @Override
    public boolean process(final ProductOrderRequest productOrderRequest) {
        final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
        boolean result = false;

        if (productOrderRequest != null && productOrderRequest.getSupplier().equals(EXTRA_FOOD_SHOP)) {
            System.out.println("You are making an order in ExtraFoodShop" + "\nYour order contains: "
                    + productOrderRequest.getQuantityInKG() + "kg of " + productOrderRequest.getProduct());
            result = true;
        }
        return result;
    }
}
