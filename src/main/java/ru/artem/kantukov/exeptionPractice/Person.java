package ru.artem.kantukov.exeptionPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Person {



    public static void main(String[] args) throws AgeNotValidExeption{


        try {printExeption("Ivan", 0);

        } catch (AgeNotValidExeption e) {
            System.out.println("Eres cabron");
            throw e;

        }
    }



    public static int printExeption(String name, int age) throws AgeNotValidExeption {
        if(age < 0 && age > 150) throw new AgeNotValidExeption("eres cabron");
        return age;


            }

        }




