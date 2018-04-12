package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository {
    boolean createOrder(final User user, final List<Product> productsList, final LocalDateTime orderTime);
}
