package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class FirstLambdaCheck {

    public static void main(String[] args) {
        System.out.println("processFile() = " + processFile());

        BufferedFileReader readLineOne = (bufferedReader -> bufferedReader.readLine());
        BufferedFileReader readTwoLines = (
                (br) -> {
            return br.readLine() + br.readLine();
        });
        System.out.println("readLineOne = " + processFile(readLineOne));
        System.out.println("readTwoLines = " + processFile(readTwoLines));
    }

    public static String processFile() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String processFile(BufferedFileReader bufferedFileReader) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedFileReader.process(bufferedReader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
