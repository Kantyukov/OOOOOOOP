package ru.artem.kantiukov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantukov.arrayListPractice.MyArrayList;
import ru.artem.kantukov.linkedList.MyLinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Проверка метод LinkedList")
public class MyLinkedListTest {

    private MyLinkedList list = new MyLinkedList();

    @DisplayName("Проверка метода add")
    @Test
    public void addTest() {
        list.add("Hola");
        list.add("Privet");
        assertTrue(list.add("Hola"));
        assertTrue(list.add("Privet"));
        assertTrue(list.contains("Hola"));
        assertTrue(list.contains("Privet"));
    }

    @DisplayName("Проверка метода isEmpty")
    @Test
    public void isEmptyTest() {
        list.add("Hola");
        list.isEmpty();
        assertFalse(list.isEmpty());
    }

    @DisplayName("Проверка метода clear")
    @Test
    public void clearTest() {
        list.add("Hola");
        list.add("Privet");
        list.clear();
        assertEquals(list.size(), 0); // Здесь немного непонятно, 1 потому что у нас есть head??
        // Не могу понять почему с нулем не работает
    }

    @DisplayName("Проверка метода remove")
    @Test
    public void removeTest() {
        MyArrayList list = new MyArrayList();
        list.add("Hola");
        list.add("Privet");
        list.remove("Privet");
        list.remove("Hola");
        assertFalse(list.contains("Privet"));
        assertFalse(list.contains("Hola"));
    }

    @DisplayName("Проверка метода contains")
    @Test
    public void containsTest() {
        list.add("Hola");
        list.add("Privet");

        assertTrue(list.contains("Hola"));
        assertTrue(list.contains("Privet"));
    }

    @DisplayName("Проверка метода size")
    @Test
    public void sizeTest() {
        list.add("Hola");
        assertEquals(1, list.size());
    }

    @DisplayName("Проверка метода get")
    @Test
    public void getTest() {
        list.add("Hola");
        list.add("Privet");
        assertEquals("Hola", list.get(0));
        assertEquals("Privet", list.get(1));
    }

    @DisplayName("Проверка метода set")
    @Test
    public void setTest() {
        list.add("Hola");
        list.set(0, "Privet");
        assertEquals("Privet", list.get(0));
    }


    @DisplayName("Проверка метода lastIndexOf")
    @Test
    public void lastIndexOfTest() {
        list.add("Hola");
        list.add("Hola");
        list.add("Hola");
        list.add("Hola");
        list.add("Hola");
        list.lastIndexOf("Hola");
        assertEquals(4, list.lastIndexOf("Hola"));
    }

    @DisplayName("Проверка метода IndexOf")
    @Test
    public void indexOfTest() {
        list.add("Hola");
        list.add("Hola1");
        list.add("Hola2");
        list.add("Hola3");
        assertEquals(0, list.indexOf("Hola"));
        assertEquals(1, list.indexOf("Hola1"));
        assertEquals(2, list.indexOf("Hola2"));
    }

}


