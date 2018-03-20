package com.maghi711.corejava.java8.afterlambda;

public class RunnableLambda {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i=0; i< 3; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
        thread.join();
        System.out.println(Thread.currentThread().getName());
    }
}
