package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2, 1);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Range exceeded! Error " + e);

        } finally {
            System.out.println("x should belong to the range <1, 2), and y be different from 1.5!");
        }
    }
}
