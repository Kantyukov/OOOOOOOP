package ru.artem.kantukov.serialPractice;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person ivan = new Person("Gamer777", "YaLublyuMamok");
        Person danil = new Person("Boomer", "007DanyaMaster");
        Person olga = new Person("Gladiolus1993", "Logitech1919toMy");
        List<Person> allLogins = new ArrayList<>(Arrays.asList(ivan,danil,olga));

//        FileOutputStream outputStream = new FileOutputStream("src/main/resources/login.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(allLogins);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/main/resources/login.txt"));
        Object obj = inputStream.readObject();

        List<Person> allLogin = ( List<Person>) obj;
        System.out.println(allLogin);

    }

}
