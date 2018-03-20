package com.maghi711.corejava.java8.afterlambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorIntegerLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Swetha", "Mahesh", "Aadavan");
        System.out.println("names = " + names);
        Collections.sort(names, ((o1, o2) -> {
            return o1.toString().compareTo(o2.toString());
        }));
        System.out.println("names = " + names);
    }
}
