package ru.artem.kantukov.person;

public interface Eatable {
    default void eat(){
        System.out.println("Ням ням ням");
    }
}
