package ru.artem.kantukov.person;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Plant implements Talkable, Eatable{
    private String name;


    public void eat() {

    }


    public void talk(String phrase) {

    }

}
