package ru.artem.kantukov.collectionPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private final String name;
    private final String author;
    private final int countOfPage;


}
