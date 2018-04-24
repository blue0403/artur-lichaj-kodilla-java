package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result = a + b;
        System.out.println("Result of adding " + a + " and " + b + ":");
        return display.displayValue(result);
    }

    public double sub(double a, double b) {
        double result = a - b;
        System.out.println("Result of subtracting " + b + " from " + a + ":");
        return display.displayValue(result);
    }

    public double mul(double a, double b) {
        double result = a * b;
        System.out.println("Result of multiplying " + a + " and " + b + ":");
        return display.displayValue(result);
    }

    public double div(double a, double b) {
        double result = a / b;
        System.out.println("Result of dividing " + a + " by " + b + ":");
        return display.displayValue(result);
    }
}
