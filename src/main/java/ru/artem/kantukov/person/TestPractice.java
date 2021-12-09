package ru.artem.kantukov.person;

public class TestPractice {
    public static void main(String[] args) {
        Person jack = new Person("Jack", 17);
        jack.takeBeer();
        System.out.println("jack.takeBeer() = " + jack.takeBeer());
        jack.birthDay();
        System.out.println("jack.takeBeer() = " + jack.takeBeer());
        System.out.println("jack.toString() = " + jack.toString());
        jack.birthDay();
        System.out.println("jack.takeBeer() = " + jack.takeBeer());
        System.out.println("jack.toString() = " + jack.toString());


    }
}
