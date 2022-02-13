package ru.artem.kantukov.comparePracticec.birds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class Birds {

    private final String name;
    private final String cry;
    private boolean voice;

   // public Birds(String name, String cry, boolean voice) {
    //   this.name = name;
    // this.cry = cry;
    //    this.voice = voice;

    //}
    @Override
    public String toString() {
        return "{ " + name + ": " + cry + "} { voice: " + voice + " }";
    }

    @Override //Переопределяем equals
    public boolean equals(Object o) {
        if (this == o) return true; // Если сылаемся на один объект возвращаемя тру
        if (!(o instanceof Birds birds)) return false; // Мы проверяем является ли объект экземпляром класса Птица. Если нет, возвращает фалсе
        // Приводим тип данных

        if (!Objects.equals(name, birds.name)) return false; // Савниваем имя и именем объекта, если не равны выводим фалс
        return cry.equals(birds.cry);   // Если все тру сравниваем другие параметры
    }

    @Override // Перепределяем HashCode
    public int hashCode(){
        return name.hashCode();
    }



}
