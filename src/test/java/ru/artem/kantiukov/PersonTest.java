package ru.artem.kantiukov;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantukov.person.Person;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс должен содержать ряд тестов:")

public class PersonTest {
    public static final String DEFAULT_NAME = "Ivan";
    public static final int AGE = 18;
    public static final String NEW_NAME = "Nikita";
    public static final int NEW_AGE = 67;

    @DisplayName(" корректно создается конструктором")
    @Test

    public void shouldHaveCorrectName (){
        Person ivan = new Person(DEFAULT_NAME, AGE);
//        assertEquals(DEFAULT_NAME, ivan.getName());
//        assertEquals(AGE, ivan.getAge());
        assertAll ("ivan", ()-> assertEquals(DEFAULT_NAME, ivan.getName()),
                ()-> assertEquals(AGE, ivan.getAge())  );
    }
    @DisplayName("Корректо изменять имя и возраст")
    public void shouldHaveCorrectPersonUpdate (){
        Person ivan = new Person(DEFAULT_NAME, AGE);
        assertAll ("ivan", ()-> assertEquals(NEW_NAME, ivan.getName()),
                ()-> assertEquals(NEW_AGE, ivan.getAge()),
                ()-> assertEquals(NEW_NAME, ivan.getName())
        );
//        assertEquals(NEW_NAME, ivan.getName());
//        assertEquals(NEW_AGE, ivan.getAge());
    }
    @DisplayName("проверка методов")
    public void testTakeBeer (){
        Person ivan = new Person(DEFAULT_NAME, AGE);
        assertEquals(DEFAULT_NAME,NEW_AGE);}
    public void testBirthDay (){
        Person ivan = new Person(DEFAULT_NAME, AGE);
        assertEquals(DEFAULT_NAME,NEW_AGE);}

}
