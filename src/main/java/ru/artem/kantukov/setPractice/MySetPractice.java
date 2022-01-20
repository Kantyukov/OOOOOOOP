package ru.artem.kantukov.setPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class MySetPractice {
    public static void main(String[] args) {
        Collection<Fruit> fruits = new HashSet<>();
        Fruit apple = new Fruit("Apple", 10);
        Fruit orange = new Fruit("Orange", 12);
        Fruit banana = new Fruit("Banana", 21);
        Fruit appleGreen = new Fruit("Apple", 10);
        fruits = new HashSet<>(Arrays.asList(apple, orange, banana, appleGreen));
        System.out.println("fruits = " + fruits);
        System.out.println("fruits.remove(apple) = " + fruits.remove(apple));
        System.out.println("fruits.contains(apple) = " + fruits.contains(apple));
        fruits.add(appleGreen);
        System.out.println("fruits = " + fruits);

    }
}
