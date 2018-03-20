package com.maghi711.corejava.java8.beforelambda;

import java.io.File;
import java.io.FileFilter;

//com.maghi711.corejava.java8.afterlambda
public class JavaFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".java");
    }

    public static void main(String[] args) {
        JavaFileFilter fileFilter = new JavaFileFilter();
        File dir = new File("d:/tmp");
        File[] javaFiles = dir.listFiles(fileFilter);
        for (File file: javaFiles) {
            System.out.println(file.getName());
        }
    }
}
