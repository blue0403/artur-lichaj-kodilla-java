package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultOfAdding = calculator.addAToB(25, 24);
        int resultOfSubtracting = calculator.subtractAFromB(28, 149);

        if (resultOfAdding == 49){
            System.out.println("Test of adding is OK");
        } else {
            System.out.println("Error!");
        }

        if (resultOfSubtracting == 121){
            System.out.println("Test of subtracting is OK");
        } else {
            System.out.println("Error!");
        }

        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle();
        collector.addFigure(circle);
        collector.showFigures();
    }
}
