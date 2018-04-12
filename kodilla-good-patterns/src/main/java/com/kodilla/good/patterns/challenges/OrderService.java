package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    boolean order(final User user, final List<Product> productList, final LocalDateTime orderTime);
}
