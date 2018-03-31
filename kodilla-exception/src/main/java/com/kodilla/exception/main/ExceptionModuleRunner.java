package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
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
    }
}
