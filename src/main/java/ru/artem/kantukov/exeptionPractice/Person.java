package ru.artem.kantukov.exeptionPractice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Person {


    public static void main(String[] args) {
        Man ivan = new Man("Ivan", 180);


      try {
          ivan.printException();
                } catch (AgeNotValidException e) {
          System.out.println("Idiot");;
      }


    }
}








