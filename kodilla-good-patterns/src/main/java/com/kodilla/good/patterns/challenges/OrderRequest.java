package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class OrderRequest {
    private User user;
    private List<Product> orderedProducts;
    private LocalDateTime orderTime;

    public OrderRequest(final User user, final List<Product> orderedProducts, final LocalDateTime orderTime) {
        this.user = user;
        this.orderTime = orderTime;
        this.orderedProducts = orderedProducts;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
