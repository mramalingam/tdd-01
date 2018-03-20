package com.maghi711.corejava.java8.beforelambda;

import java.io.File;
import java.io.FileFilter;

public class AnonymousFileFilter {

    public static void main(String[] args) {

        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };
        File dir = new File("d:/tmp");
        File[] javaFiles = dir.listFiles(fileFilter);
        for (File file: javaFiles) {
            System.out.println(file.getName());
        }
    }
}
