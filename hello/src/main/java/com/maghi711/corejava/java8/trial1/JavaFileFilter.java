package com.maghi711.corejava.java8.trial1;

import java.io.File;

public class JavaFileFilter implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }

}
