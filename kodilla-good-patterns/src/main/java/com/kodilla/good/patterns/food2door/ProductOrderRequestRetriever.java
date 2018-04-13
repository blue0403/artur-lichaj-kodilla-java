package com.kodilla.good.patterns.food2door;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        String supplier = "ExtraFoodShop";
        Double quantityInKG = 34.8;
        String product = "banana";

        return new ProductOrderRequest(supplier, quantityInKG, product);
    }
}
