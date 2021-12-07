package ru.artem.kantukov.ComparePracticec;

import java.util.Arrays;

public class ComparablePractice {
    public static void main(String[] args) throws CloneNotSupportedException {
    Boy artem = new Boy ("Artem", 27, 189);
    Boy vitalya = new Boy("Vitalya", 26, 130);
        System.out.println("artem.compareTo(vitalya) = " + artem.compareTo(vitalya));
    Person masha = new Person("Masha", "Ivanova", 14, "Masha@mail.ru");
    Person ivan = new Person("Ivan", "Ivanos", 29, "Ivan007@gmail.com");
    Person kiril = new Person("Kiril", "Starilov", 23, "KirKri@mail.box");
    Person andrei = new Person("Andrei", "Armanidze", 14, "AndrewArma@yandex.ru");
    Person kiril2 = (Person) kiril.clone();
        System.out.println("kiril2 = " + kiril2);
    kiril2.setAge(29);

        System.out.println("kiril2 = " + kiril2);
    Person [] person = {masha, ivan, kiril,kiril2, andrei};
        System.out.println("Arrays.toString(person) = " + Arrays.toString(person));
    Arrays.sort(person);
        System.out.println("Arrays.toString(person) = " + Arrays.toString(person));
    }
}
