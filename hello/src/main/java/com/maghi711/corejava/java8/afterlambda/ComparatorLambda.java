package com.maghi711.corejava.java8.afterlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("***", "*****", "**", "*", "****");
        Collections.sort(list, (o1, o2) ->
                Integer.compare(o1.length(), o2.length()));
        for (String s: list) {
            System.out.println(s);
        }
    }
}
