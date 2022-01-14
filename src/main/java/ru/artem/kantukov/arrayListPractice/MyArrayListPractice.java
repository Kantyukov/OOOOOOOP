package ru.artem.kantukov.arrayListPractice;


public class MyArrayListPractice {
    public static void main(String[] args) {
    MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("Hola!");
        list.add("Que tal?");
        System.out.println("list.size() = " + list.size());
        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Hola!\") = " + list.contains("Hola!"));
        System.out.println("list.remove(\"Hola!\") = " + list.remove("Hola!"));

        list.clear();
        System.out.println("list.size() = " + list.size());

    }
}
