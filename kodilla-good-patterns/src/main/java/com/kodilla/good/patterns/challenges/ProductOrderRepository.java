package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(final User user, final List<Product> productsList, final LocalDateTime orderTime) {
        boolean result = false;

        OrderRequest order = new OrderRequest(user, productsList, orderTime);
        List<OrderRequest> orderList = new ArrayList<>();
        orderList.add(order);

        if (orderList.contains(order)) {
            result = true;
        }

        return result;
    }
}
