package org.example;

//  Задача 1:
//        Создайте абстрактный класс "Animal" с полями "name" и "age".
//        Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
//        Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
//        Выведите на экран информацию о каждом объекте.
//        Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {

        Class<?> dogClass = Class.forName("org.example.Dog");
        Class<?> catClass = Class.forName("org.example.Cat");

        Constructor[] dogClassConstructor = dogClass.getConstructors();
        Constructor[] catClassConstructor = catClass.getConstructors();

        List<Object> animalList = new ArrayList<>();

        animalList.add(dogClassConstructor[0].newInstance("Barsik", 3.5, "Black"));

        animalList.add(catClassConstructor[0].newInstance("Tom", 9.0, 5));

        System.out.println(animalList.get(0).toString());
        System.out.println(animalList.get(1).toString());

        try {
            Method dogClassMethod = dogClass.getDeclaredMethod("makeSound");
            dogClassMethod.invoke(animalList.get(0));
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }

        try {
            Method catClassMethod = catClass.getDeclaredMethod("makeSound");
            catClassMethod.invoke(animalList.get(1));
        } catch (NoSuchMethodException e){
            System.out.println("No 'makeSound' method found in " + animalList.get(1).getClass() + " class.");
        }



    }
}