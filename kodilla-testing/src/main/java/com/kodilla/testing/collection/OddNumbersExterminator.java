package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator(){
        evenNumbers = new ArrayList<>();
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        int number;

        for (int n=0; n < numbers.size(); n++){
            number = numbers.get(n);
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
