package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class MailService implements InformationService {

    @Override
    public void inform(final User user, final List<Product> orderedProducts, final LocalDateTime orderTime) {
        System.out.println("Welcome " + user.getUsername() + ",\n\nYou have ordered in our service:" + "\n");
        for(Product product : orderedProducts) {
            System.out.println(product);
        }
        System.out.println("\nDate of order: " + orderTime);
    }
}
