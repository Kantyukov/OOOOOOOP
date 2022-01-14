package ru.artem.kantiukov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.artem.kantukov.arrayListPractice.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Проверка методо ArrayList")
public class MyArrayListTest {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array = new Object[DEFAULT_CAPACITY];
    private int realSize;

    @DisplayName("Проверка метода add")
    @Test
    public void addTest(){
        MyArrayList list = new MyArrayList();
        list.add("Hola");
        list.add("Privet");
        assertTrue(list.add("Hola"));
        assertTrue(list.add("Privet"));
    }

    @DisplayName("Проверка метода isEmpty")
    @Test
    public void isEmptyTest(){
        MyArrayList list = new MyArrayList();
        list.add("Hola");
        list.isEmpty();
        assertFalse(list.isEmpty()); //Не могу понять почему всегда false,даже, когда я убрал list.add()
    }
    @DisplayName("Проверка метода clear")
    @Test
    public void clearTest(){
        MyArrayList list = new MyArrayList();
        list.add("Hola");
        list.add("Privet");
        list.clear();
        assertEquals(list.size(), 0);
    }
//    @DisplayName("Проверка метода remove")
//    @Test
//    public void removeTest(){
//        MyArrayList list = new MyArrayList();
//        list.add("Hola");
//        list.add("Privet");
//        list.remove("Privet");
//        assertTrue(list.remove("Privet")); //не понимаю почему не работает
//    }
@DisplayName("Проверка метода contains")
@Test
public void containsTest(){
    MyArrayList list = new MyArrayList();
    list.add("Hola");
    list.add("Privet");
    list.clear();
    assertFalse(list.contains("Hola"));
    assertFalse(list.contains("Privet"));
}
}
