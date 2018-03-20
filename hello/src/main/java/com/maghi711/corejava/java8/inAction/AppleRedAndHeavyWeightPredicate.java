package com.maghi711.corejava.java8.inAction;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class AppleRedAndHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "Orange".equals(apple.getColor()) && apple.getWeight() == 300;
    }
}
