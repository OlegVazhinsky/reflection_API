package org.example;

public class Cat extends Animal{

    private int numberOfLives;

    public Cat(String name, double age, int numberOfLives) {
        super(name, age);
        this.numberOfLives = numberOfLives;
    }

    public int getNumberOfLives(){
        return this.numberOfLives;
    }

    public String toString(){
        return "Cat's name: " + getName() + "\n" +
                "Cat's age: " + getAge()+ "\n" +
                "Cat's number of lives: " + getNumberOfLives();
    }

}
