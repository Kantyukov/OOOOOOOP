package ru.artem.kantukov.person;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
public class Person implements Talkable, Eatable  {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;

        }

    public void birthDay() {
        this.age++;
    }

    public boolean takeBeer() {
        return age >= 18;

    }

    public void talk(String phrase) {
        System.out.println(phrase);
    }


    public void eat() {
        System.out.println(" Я ем все и вся, особенно мясооооооо");
    }
}