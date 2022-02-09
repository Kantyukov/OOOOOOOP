package ru.artem.kantukov.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cow implements Talkable, Eatable {
    private final String name;
    private String color;



    public void eat() {

    }


    public void talk(String phrase) {

    }
}
