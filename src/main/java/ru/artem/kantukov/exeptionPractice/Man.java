package ru.artem.kantukov.exeptionPractice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Man {
    private int age;
    private String name;

    int printExeption(String name, int age) {
        this.age = age;
        this.name = name;

        try {
            if (age < 0 || age > 150)
                throw new AgeNotValidExeption("eres cabron");
            System.out.println("U are good");
        } catch (AgeNotValidExeption e) {
            System.out.println("Eres cabron");
        }

        return age;
    }

}