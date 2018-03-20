package com.maghi711.corejava.java8.trial1;

import java.io.File;
import java.io.FileFilter;

public class BeforeLambda {

    public static void main(String[] args) {
        System.out.println("Before using Lambda");
        FileFilter javaFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };

        File dir = new File("d:/tmp");
        File[] javaFiles = dir.listFiles(javaFilter);
        for (File file : javaFiles) {
            System.out.println("file.getName() = " + file.getName());
        }
    }
}
