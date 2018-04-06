package com.maghi711.corejava.java8.lambda01;

import java.util.Comparator;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class HelloLambda {

    public static void main(String[] args) {
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        Comparator<Apple> byWeightLambda = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());
    }
}
