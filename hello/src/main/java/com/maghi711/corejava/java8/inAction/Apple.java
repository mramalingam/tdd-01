package com.maghi711.corejava.java8.inAction;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Mahesh Ramalignam
 */
public class Apple {

    private int id;
    private String color;
    private String name;
    private int weight;

    public Apple() {
    }

    /**
     * This constructs an apple based on the color.
     * @param color
     */
    public Apple(String color) {
        this.color = color;
    }

    /**
     * This constructs an apple with its name and color.
     * @param color
     * @param name
     */
    public Apple(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Apple(String color, String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Apple(int id, String color, String name, int weight) {
        this.id = id;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
