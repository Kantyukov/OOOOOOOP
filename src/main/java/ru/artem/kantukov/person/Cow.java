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

    @Override
    public void eat() {
        System.out.println("Я люблю есть трау");
    }

    @Override
    public void talk(String frase) {
        System.out.println(frase);
    }
}
