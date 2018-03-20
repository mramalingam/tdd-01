package com.maghi711.corejava.java8.beforelambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorOld {

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        List<String> list = Arrays.asList("**", "***", "*", "*****", "****");
        Collections.sort(list, comparator);

        for (String s: list) {
            System.out.println(s);
        }
    }
}
