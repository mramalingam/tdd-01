package com.maghi711.corejava.java8.trial1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {
        BigDecimal d = new BigDecimal("5.00");
        Double percentage = Double.parseDouble("5.0");
        System.out.println("percentage = " + percentage);
        System.out.println("d = " + d);
        //lambdaCode();
    }

    private static void lambdaCode() {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        List<String> stringList = Arrays.asList("***", "*****", "*", "**", "****");
        System.out.println("stringList = " + stringList);

        //Collections.sort(stringList,stringComparator);
        System.out.println("stringList = " + stringList);

        Comparator<String> stringComparatorList = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
        Comparator<String> shortStringLambda = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Collections.sort(stringList, stringComparatorList);

        System.out.println("stringComparatorList = " + stringList);

        stringList.forEach(System.out::println);
    }
}
