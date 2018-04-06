package com.maghi711.corejava.java8.tdd_02;

import org.junit.Assert;
import org.junit.Test;

/**
 * The Class DictonaryTest.
 *
 * @author Davinta Technologies
 */
public class DictonaryTest {

    @Test
    public void testDictionaryCreation() {
        Dictionary dictonary = new Dictionary();
        Assert.assertTrue(dictonary.isEmpty());
    }

    @Test
    public void testAddTranslation() {
        Dictionary dictionary = new Dictionary();
        dictionary.addTranslation("Buch","book");
        Assert.assertFalse(dictionary.isEmpty());
    }
}
