package ru.artem.kantukov.linkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.size() = " + list.size());
        list.add("строка 1");
        System.out.println("СТрока " +list.indexOf("строка 1"));
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        list.add("строка 2");
        System.out.println("list.indexOf(\"строка 2\") = " + list.indexOf("строка 2"));
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
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.get(2) = " + list.get(2));
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(6) = " + list.get(6));
        System.out.println("СТрока " +list.indexOf("строка 7"));
        
        System.out.println("list = " + list);
        System.out.println("list.set(1, \"Строка 2\") = " + list.set(1, "Строка 2"));
        System.out.println("list = " + list);
        list.remove(5);
        System.out.println(list);
        list.clear();
        System.out.println("list = " + list);

        list.add("строка XXL");
        list.add("строка XXL");
        list.add("строка XXL");
        list.add("строка XXL");
        System.out.println("list.lastIndexOf(\"строка XXL\") = " + list.lastIndexOf("строка XXL"));


    }
}
