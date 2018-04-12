package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("red21", "Matthew", "Redstone");

        List<Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(new Book());
        orderedProducts.add(new Game());
        orderedProducts.add(new Slippers());
        orderedProducts.add(new Toothbrush());

        LocalDateTime orderTime = LocalDateTime.of(2018, 4, 12, 5, 39);

        return new OrderRequest(user, orderedProducts, orderTime);
    }
}
