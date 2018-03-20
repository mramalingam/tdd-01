package com.maghi711.corejava.java8.inAction;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("Green");
    }

}
