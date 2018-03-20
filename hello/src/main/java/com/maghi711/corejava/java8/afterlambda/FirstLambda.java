package com.maghi711.corejava.java8.afterlambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) {
        FileFilter fileFilter = pathname -> pathname.getName().endsWith(".java");

        File[] javaFiles = new File("d:/tmp").listFiles(fileFilter);

        for(File file: javaFiles) {
            System.out.println(file.getName());
        }
    }
}
