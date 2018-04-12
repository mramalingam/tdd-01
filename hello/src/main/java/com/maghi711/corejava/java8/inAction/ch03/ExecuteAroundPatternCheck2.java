package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.function.Function;

/**
 * The ExecuteAroundPatternCheck2 class.
 *
 * @author Mahesh Ramalingam
 */
public class ExecuteAroundPatternCheck2 {

    public static void main(String[] args) {
        System.out.println("processDate(); = " + processDate());
        System.out.println("processData() = " + processData(
                (bufferedReader) ->
        {
            String result = null;
            try {
                result = bufferedReader.readLine() + bufferedReader.readLine() + bufferedReader.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }
        ));
    }

    /**
     * Process data by externalizing the behavior using functional interface.
     *
     * @param function the function
     * @return the string
     */
    public static String processData(Function<BufferedReader, String> function) {
        String result = null;
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            result = function.apply(br);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Before Lambda.
      * @return
     */
    public static String processDate() {
        String result = null;
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            result = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
