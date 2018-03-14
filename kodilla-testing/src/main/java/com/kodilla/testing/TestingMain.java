package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

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
    }
}
