package com.maghi711.corejava.java8.inAction;

import javax.swing.plaf.SplitPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class FilterList2_1 {

    public static void main(String[] args) {
        List<Apple> fruitsList = new ArrayList<>();
        initialize(fruitsList);

        //List<Apple> greenApples = filterGreenApples(fruitsList);
        List<Apple> greenApples = filterApplesByColor(fruitsList, "Green");
        System.out.println("greenApples = " + greenApples);

        List<Apple> selectedApples = filterApplesByColor(fruitsList, "Red");
        System.out.println("selectedApples = " + selectedApples);

        selectedApples = filterApplesByWeight(fruitsList, 150);
        System.out.println("selectedApples = " + selectedApples);

    }

    private static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> selectedApples= new ArrayList<>();
        for (Apple apple: inventory) {
            if (weight == apple.getWeight()) {
                selectedApples.add(apple);
            }
        }
        return selectedApples;
    }

    /**
     * Filter apples by the color you like.
     * @param inventory
     * @param color
     * @return
     */
    private static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> selectedApples= new ArrayList<>();
        for (Apple apple: inventory) {
            if (color.equals(apple.getColor())) {
                selectedApples.add(apple);
            }
        }
        return selectedApples;
    }

    /**
     * First Attempt: Filter by Green Color
     * @param inventory
     * @return
     */
    private static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> greenApples= new ArrayList<>();
        for (Apple apple: inventory) {
            if ("Green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    private static List<Apple> initialize(List<Apple> fruitsList) {
        String colors[] = new String[] {"Red", "Green", "Orange"};
        Random random = new Random(colors.length);
        for (int i = 0; i < 100; i++) {
            int weight = random.nextInt(colors.length);
            String color = colors[weight];
            fruitsList.add(new Apple(i, color, color, 150 * weight));
        }
        System.out.println("fruitsList = " + fruitsList);
        return fruitsList;
    }
}
