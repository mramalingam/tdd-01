package com.maghi711.corejava.java8.tdd_01;

/**
 * The Class ${CLASS_NAME}.
 *
 * @author Davinta Technologies
 */
public class Car {

    private String name;
    private String type;

    public Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
