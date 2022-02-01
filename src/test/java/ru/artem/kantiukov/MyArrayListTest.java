package ru.artem.kantiukov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantukov.arrayListPractice.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Проверка методо ArrayList")
public class MyArrayListTest {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private MyArrayList list = new MyArrayList();
    private int realSize;

    @DisplayName("Проверка метода add")
    @Test
    public void addTest(){
        list.add("Hola");
        list.add("Privet");
        assertTrue(list.add("Hola"));
        assertTrue(list.add("Privet"));
        assertTrue(list.contains("Hola"));
        assertTrue(list.contains("Privet"));
    }

    @DisplayName("Проверка метода isEmpty")
    @Test
    public void isEmptyTest(){
        list.add("Hola");
        list.isEmpty();
        assertFalse(list.isEmpty());
    }
    @DisplayName("Проверка метода clear")
    @Test
    public void clearTest(){
        list.add("Hola");
        list.add("Privet");
        list.clear();
        assertEquals(list.size(), 0);
    }
    @DisplayName("Проверка метода remove")
    @Test
    public void removeTest(){
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
    public void containsTest(){
        list.add("Hola");
        list.add("Privet");

        assertTrue(list.contains("Hola"));
        assertTrue(list.contains("Privet"));
        }

    @DisplayName("Проверка метода size")
    @Test
    public void sizeTest(){
       list.add("Hola");
        assertEquals(1, list.size());
    }
    @DisplayName("Проверка метода get")
    @Test
    public void getTest(){
        list.add("Hola");
        list.add("Privet");
        assertEquals("Hola", list.get(0));
        assertEquals("Privet", list.get(1));
    }

    @DisplayName("Проверка метода set")
    @Test
    public void setTest(){
        list.add("Hola");
        list.set(0, "Privet");
        assertEquals("Privet", list.get(0));
    }
    
    @DisplayName("Проверка метода lastIndexOf")
    @Test
    public void lastIndexOfTest(){
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
    public void addElementWithIndexTest(){
        list.add("Hola 0");
        list.add("Hola 1");
        list.add("Hola 3");
        list.add(2,"Hola 2");
        list.add(4,"Hola 4");

        assertEquals(2, list.indexOf("Hola 2"));
        assertEquals(4, list.indexOf("Hola 4"));

        list.add(0, "FIRST");
        assertEquals(0, list.indexOf("FIRST"));
        assertEquals(5, list.indexOf("Hola 4"));
    }


}
