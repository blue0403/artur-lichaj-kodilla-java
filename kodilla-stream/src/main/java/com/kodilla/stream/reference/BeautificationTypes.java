package com.kodilla.stream.reference;

public class BeautificationTypes {
    public static String createUpperCase (String text){
        return text.toUpperCase();
    }

    public static String addABCAtBeginningAndEndOfText (String text){
        return "ABC" + text + "ABC";
    }

    public static String reverseTheOrderOfLetters (String text){
        return new StringBuilder(text).reverse().toString();
    }

    public static String addTextLength (String text){
        return text + " (length of the text: " + text.length() + ")";
    }
}
