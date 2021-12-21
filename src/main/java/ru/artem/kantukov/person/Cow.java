package ru.artem.kantukov.person;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cow implements Talkable, Eatable {
    private final String name;
    private String color;
//    public Cow (String name, String color){
//        this.name = name;
//        this.color = color;
//    }


    public void eat() {

    }


    public void talk(String frase) {

    }
}
