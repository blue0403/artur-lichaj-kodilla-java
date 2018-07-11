package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class CherryTomatoesDecorator extends AbstractPizzaOrderDecorator {
    public CherryTomatoesDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost(). add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", cherry tomatoes";
    }
}
