package org.example;

public class Dog extends Animal{

    private String collarsColour;

    public Dog(String name, double age, String collarsColor) {
        super(name, age);
        this.collarsColour = collarsColor;
    }

    public String getCollarsColour(){
        return this.collarsColour;
    }

    public void makeSound(){
        System.out.println(getName() + " makes whoof!");
    }

    public String toString(){
        return "Dog's name: " + getName() + "\n" +
                "Dog's age: " + getAge()+ "\n" +
                "Collars colour: " + getCollarsColour();
    }

}
