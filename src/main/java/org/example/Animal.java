package org.example;

public abstract class Animal {
    private String name;
    private double age;

    public Animal(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public double getAge() {
        return this.age;
    }
}
