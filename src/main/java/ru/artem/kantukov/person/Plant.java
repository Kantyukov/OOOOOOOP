package ru.artem.kantukov.person;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Plant implements Talkable, Eatable{
    private String name;


    public void eat() {
        System.out.println("Я впитываю ультрафиолет");
    }


    public void talk(String frase) {
        System.out.println(frase);
    }
}
