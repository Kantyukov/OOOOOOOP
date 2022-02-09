package ru.artem.kantukov.exeptionPractice;


public class Person {


    public static void main(String[] args) {
        Man ivan = new Man("Ivan", 180);


      try {
          ivan.printException();
                } catch (AgeNotValidException e) {
          System.out.println("Idiot");
      }


    }
}








