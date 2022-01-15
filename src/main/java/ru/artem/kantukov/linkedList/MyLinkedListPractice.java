package ru.artem.kantukov.linkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        list.add("строка 1");
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        list.add("строка 2");
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        list.add("строка 3");
        System.out.println("list.size() = " + list.size());
        list.add("строка 4");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        list.add("строка 5");
        list.add("строка 6");
        list.add("строка 7");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.contains(\"строка 5\") = " + list.contains("строка 5"));
        System.out.println("list.contains(\"строка 9\") = " + list.contains("строка 9"));
    }
}
