package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class ExecuteAroundPatternCheck {

    public static void main(String[] args) throws IOException {
        String beforeLambda = processBeforeLambda();
        System.out.println("BeforeLambda = " + beforeLambda);
        String data = processAfterLambda((BufferedReader br) -> {
            String result = null;
            try {
                result = br.readLine() + br.readLine();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            return result;
        });
        System.out.println("AfterLambda = " + data);
    }

    public static String processBeforeLambda() throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return bufferedReader.readLine();
        }
    }

    public static String processAfterLambda(Function<BufferedReader, String> p) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
            return p.apply(bufferedReader);
        }
    }
}
