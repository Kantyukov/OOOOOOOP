package ru.artem.kantukov.comparePracticec.birds;

public class Oop {
    public static void main(String[] args) {
        Birds kesha = new Parrots();
        System.out.println(kesha);
        Birds vorona = new Crows();
        Birds popugai = new Parrots();
        System.out.println(vorona);
        System.out.println("kesha.equals(vorona) = " + kesha.equals(vorona));
        System.out.println("kesha.hashCode() = " + kesha.hashCode());

        System.out.println("popugai.equals(kesha) = " + popugai.equals(kesha));
    }


}
