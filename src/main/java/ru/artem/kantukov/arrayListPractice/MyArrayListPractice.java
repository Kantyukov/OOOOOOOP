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
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.lastIndexOf(\"Que tal?\") = " + list.lastIndexOf("Que tal?"));
        // System.out.println("list.lastIndexOf(\"Hola!\") = " + list.lastIndexOf("Hola!"));
        System.out.println("list.remove(0) = " + list.remove(0));
        list.clear();
        System.out.println("list.size() = " + list.size());
        list.add("pam pam");
        System.out.println("list.indexOf(pam pam) = " + list.indexOf("pam pam"));
        list.add("uraaaaa!");
        System.out.println("list.indexOf(\"uraaaaa!\") = " + list.indexOf("uraaaaa!"));
//        System.out.println("list.indexOf(\"dsfsdf\") = " + list.indexOf("dsfsdf"));
        list.set(1,"Buenas noches");
        System.out.println("list.indexOf(\"Buenas noches\") = " + list.indexOf("Buenas noches"));
        list.add(2, "Hello world!!!"); // не понимаю почему перед значением стоит null
        System.out.println("list = " + list);




    }
}
