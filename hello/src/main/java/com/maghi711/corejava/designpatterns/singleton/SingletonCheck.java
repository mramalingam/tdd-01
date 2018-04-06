package com.maghi711.corejava.designpatterns.singleton;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class SingletonCheck {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

        System.out.println("runtime = " + runtime);

        Runtime anotherRuntime = Runtime.getRuntime();
        System.out.println("anotherRuntime = " + anotherRuntime);

        if (runtime == anotherRuntime) {
            System.out.println("Both these runtime instances are same.");
        }
    }
}
