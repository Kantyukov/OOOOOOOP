package ru.artem.kantukov.ComparePracticec;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Boy implements Comparable<Boy>{
    private final String name;
    private double age;
    private double high;


    @Override
    public int compareTo(Boy boy) {
        return (int) (age - boy.age);

    }
}

