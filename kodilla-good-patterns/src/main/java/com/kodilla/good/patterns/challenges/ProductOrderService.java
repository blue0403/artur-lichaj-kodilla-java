package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(final User user, final List<Product> productList, final LocalDateTime orderTime) {
        boolean result = false;

        if (user !=  null && productList.size() > 0 && orderTime != null) {
            result = true;
        }

        return result;
    }
}
