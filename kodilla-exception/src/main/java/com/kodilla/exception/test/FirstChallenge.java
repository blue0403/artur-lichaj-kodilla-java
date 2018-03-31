package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            double result = a / b;
            if(b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException e) {
            throw new ArithmeticException("Parameter b must be different from zero! Error: " + e);

        } finally {
            System.out.println("Remember that you can not divide by zero!");
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
