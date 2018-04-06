package com.maghi711.corejava.java8.inAction.ch03;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
@FunctionalInterface
public interface ProcessData {
    String process(BufferedReader br) throws IOException;
}
