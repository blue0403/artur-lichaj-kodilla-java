package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Bacon")
                .bun("With sesame seeds")
                .sauce("Barbecue")
                .burgers(3)
                .ingredient("Cucumber")
                .ingredient("Chili Peppers")
                .ingredient("Mushrooms")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(8, howManyIngredients);
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("With sesame seeds", bigmac.getBun());
        Assert.assertEquals("Barbecue", bigmac.getSauce());
    }
}
