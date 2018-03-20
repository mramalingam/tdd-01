package com.maghi711.corejava.java8.inAction;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() == 150;
    }
}
