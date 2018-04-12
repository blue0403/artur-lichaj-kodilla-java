package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public interface InformationService {
    void inform(final User user, final List<Product> productList, final LocalDateTime orderTime);
}
