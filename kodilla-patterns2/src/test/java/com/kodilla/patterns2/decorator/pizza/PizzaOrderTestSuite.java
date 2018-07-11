package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithHamAndExtraCheeseGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println("Total value of your order: " + pizza.getCost());
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(21.00), theCost);
    }

    @Test
    public void testPizzaWithHamAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println("Order description: " + pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Bottom, tomato sauce and cheese, ham + extra cheese", description);
    }

    @Test
    public void testPizzaWithOnionMushroomsAndExtraCheeseGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println("Total value of your order: " + pizza.getCost());
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(21.00), theCost);
    }

    @Test
    public void testPizzaWithOnionMushroomsAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new OnionDecorator(pizza);
        pizza = new MushroomsDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println("Order description: " + pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Bottom, tomato sauce and cheese, onion, mushrooms + extra cheese", description);
    }

    @Test
    public void testPizzaWithHamOlivesCherryTomatoesAndArugulaGetCost() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new CherryTomatoesDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);
        System.out.println("Total value of your order: " + pizza.getCost());
        //When
        BigDecimal theCost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(25.50), theCost);
    }

    @Test
    public void testPizzaWithHamOlivesCherryTomatoesAndArugulaGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new HamDecorator(pizza);
        pizza = new OlivesDecorator(pizza);
        pizza = new CherryTomatoesDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);
        System.out.println("Order description: " + pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Bottom, tomato sauce and cheese, ham, olives, cherry tomatoes, arugula", description);
    }
}
