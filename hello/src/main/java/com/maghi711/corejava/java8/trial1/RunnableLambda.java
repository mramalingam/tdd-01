package com.maghi711.corejava.java8.trial1;

public class RunnableLambda {

    public static void main(String[] args) throws Exception {

    beforeLambda();
    afterLambda();

    }

    private static void beforeLambda() throws Exception {
        System.out.println("Before Lambda");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        t.join();
    }

    private static void afterLambda() throws Exception {
        System.out.println("After Lambda");
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            }
        };
        Thread t1 = new Thread(runnable);
        t1.start();
        t1.join();
    }

}
