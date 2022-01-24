package ru.artem.kantukov.serialPractice;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Person implements Serializable {
    private static final long serialVersionUID =1;
    private String login;
    private transient String password;
}