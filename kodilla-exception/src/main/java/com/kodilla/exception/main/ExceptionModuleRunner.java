package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithOwnException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {
    public static void main(String args[]) {

        //First way - FileReader with handling
        FileReader fileReader = new FileReader();
        fileReader.readFile();

        //Second way - FileReader without handling
        FileReaderWithoutHandling fileReaderWithoutHandling = new FileReaderWithoutHandling();

        try {
            fileReaderWithoutHandling.readFile();

        } catch (IOException e) {
            System.out.println("Problem while reading a file! Error " + e);
        }

        //Third way - FileReader with own exception
        FileReaderWithOwnException fileReaderWithOwnException = new FileReaderWithOwnException();

        try {
            fileReaderWithOwnException.readFile();

        } catch (FileReaderException e) {
            System.out.println("Something went wrong while reading a file! Error " + e);
        }
    }
}
