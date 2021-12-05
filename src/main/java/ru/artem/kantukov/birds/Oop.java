package ru.artem.kantukov.birds;

public class Oop {
    public static void main(String[] args) {
        Birds kesha = new Parrots();
        System.out.println(kesha.toString());
        Birds vorona = new Crows();
        Birds popugai = new Parrots();
        System.out.println(vorona.toString());
        System.out.println("kesha.equals(vorona) = " + kesha.equals(vorona));
        System.out.println("kesha.hashCode() = " + kesha.hashCode());
        System.out.println("kesha.equals(kesha) = " + kesha.equals(kesha));
        System.out.println("popugai.equals(kesha) = " + popugai.equals(kesha));
    }


}
