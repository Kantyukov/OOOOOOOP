package ru.artem.kantukov.person;

public interface Talkable {

    default void talk(String frase){
        System.out.println(frase);
    }

}
