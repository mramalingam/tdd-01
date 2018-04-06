package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class ThirdLambdaPractise {

    public static void main(String[] args) throws IOException {
        System.out.println("processFile() = " + processFile());

        ProcessData readOneLine = (asd) -> asd.readLine();
        ProcessData readTwoLine = (br) -> br.readLine() + br.readLine();

        System.out.println("readOneLine = " + processFile(readOneLine));
        System.out.println("readTwoLine = " + processFile(readTwoLine));
    }

    public static String processFile() throws IOException {
        // Open a file
        // read the required lines, or words
        // Close the file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReader.readLine();
        }
    }

    public static String processFile(ProcessData processData) throws IOException {
        // Open a file
        // read the required lines, or words
        // Close the file
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return processData.process(bufferedReader);
        }
    }
}
