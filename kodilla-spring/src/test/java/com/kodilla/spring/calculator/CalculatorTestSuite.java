package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculationsOfAdding() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.add(2.67, 2.33);

        //Then
        Assert.assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testCalculationsOfSubtracting() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.sub(3.43, 2.33);

        //Then
        Assert.assertEquals(1.10, result, 0.001);
    }

    @Test
    public void testCalculationsOfMultiplying() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.mul(1.10, 1.10);

        //Then
        Assert.assertEquals(1.21, result, 0.001);
    }

    @Test
    public void testCalculationsOfDividing() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double result = calculator.div(4.65, 0.15);

        //Then
        Assert.assertEquals(31.0, result, 0.001);
    }
}
