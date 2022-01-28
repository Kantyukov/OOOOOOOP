package ru.artem.kantukov.enumPractice;

public enum DayOfWeek {
    Lunes("понедельник"), Martes("вторник"), Mieroles("среда"), Jueves("четверг"),
    Viernes("пятница"), Sabado ("суббота"), Dommingo("воскресенье");
    String translation;
    DayOfWeek(String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "DayOfWeek( " + this.name() + ": "+
                "перевод = " + translation + '\'' +
                ')';
    }
}

