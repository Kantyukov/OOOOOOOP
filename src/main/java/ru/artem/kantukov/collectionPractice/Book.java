package ru.artem.kantukov.collectionPractice;

import lombok.Data;

@Data
public class Book {
    private final String name;
    private final String author;
    private final int countOfPage;

    public Book(String name, String author, int countOfPage) {
        this.name = name;
        this.author = author;
        this.countOfPage = countOfPage;
    }
}
