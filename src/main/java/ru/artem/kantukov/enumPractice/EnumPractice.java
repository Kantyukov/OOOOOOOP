package ru.artem.kantukov.enumPractice;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(DayOfWeek.Lunes);
        System.out.println(DayOfWeek.valueOf("Lunes"));
        DayOfWeek[] dayOfWeeks =  DayOfWeek.values();
        for (DayOfWeek dayOfWeek: dayOfWeeks){
            System.out.println("day : " +dayOfWeek);
        }
        DayOfWeek dayOfWeek =DayOfWeek.Viernes;
        switch (dayOfWeek){
            case Lunes -> System.out.println("Сегодня понедельник");
            case Martes -> System.out.println("Сегодня вторник");
            case Mieroles -> System.out.println("Сегодня среда");
            case Jueves -> System.out.println("Сегодня четверг");
            case Viernes -> System.out.println("Сегодня пятница");
            case Sabado -> System.out.println("Сегодня суббота");
            case Dommingo -> System.out.println("Сегодня воскресенье");
        }
    }
}
