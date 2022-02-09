package ru.artem.kantukov.exeptionPractice;



import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void printException() throws AgeNotValidException {

            if (age < 0 || age > 150)
                throw new AgeNotValidException("eres cabron");
            System.out.println("U are good");
    }

}