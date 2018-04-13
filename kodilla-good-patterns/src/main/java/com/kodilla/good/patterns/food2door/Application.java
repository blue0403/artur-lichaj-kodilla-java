package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {

        ProductOrderRequestRetriever retriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = retriever.retrieve();

        OrderValidator orderValidator = new OrderValidator(new HealthyShop());
        orderValidator.checkOrder(productOrderRequest);
    }
}
