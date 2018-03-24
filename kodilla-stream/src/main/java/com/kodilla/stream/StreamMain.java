package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.BeautificationTypes;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        //Task 1
        System.out.println("\nCreating an example text:");

        //First way
        SaySomething saySomething = new SaySomething();
        saySomething.say();

        //Second way
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        //Third way - Lambda expression
        //Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        //Fourth way
        //Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        //Task 2
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Task 3
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("\nBeautifying the text with lambdas");
        poemBeautifier.beautify("First text to beautify", text -> text.toUpperCase());
        poemBeautifier.beautify("Second text to beautify", text -> "ABC" + text + "ABC");
        poemBeautifier.beautify("Third text to beautify", text -> new StringBuilder(text).reverse().toString());
        poemBeautifier.beautify("Fourth text to beautify", text -> text + " (length of the text: " + text.length() + ")");

        System.out.println("Beautifying the text with method references");
        poemBeautifier.beautify("First text to beautify", BeautificationTypes::createUpperCase);
        poemBeautifier.beautify("Second text to beautify", BeautificationTypes::addABCAtBeginningAndEndOfText);
        poemBeautifier.beautify("Third text to beautify", BeautificationTypes::reverseTheOrderOfLetters);
        poemBeautifier.beautify("Fourth text to beautify", BeautificationTypes::addTextLength);

        //Task 4
        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
