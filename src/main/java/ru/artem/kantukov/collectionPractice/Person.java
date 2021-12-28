package ru.artem.kantukov.collectionPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {
    private final String name;
    private final int age;
    private final boolean isMale;
}
