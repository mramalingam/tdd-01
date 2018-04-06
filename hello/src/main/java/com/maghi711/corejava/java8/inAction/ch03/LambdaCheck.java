package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class LambdaCheck {

    public static void main(String[] args) throws Exception {
        System.out.println("processFile() = " + processFile());
        String readOneLine = processFile((br) -> br.readLine());
        String readTwoLine = processFile(
            (br) -> {
                return br.readLine() + br.readLine();
            }
        );
        System.out.println("readOneLine = " + readOneLine);
        System.out.println("readTwoLine = " + readTwoLine);
    }

    /**
     * Before Lamda, hard coded logic.
     * @return
     * @throws IOException
     */
    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }
}
