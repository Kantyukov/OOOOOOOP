package ru.artem.kantukov.person;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public void birthDay() {
        this.age++;
    }

    public boolean takeBeer(){
        if(age >= 18) return true;
        else return false;

    }



}
