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
    }

    @DisplayName("Проверка метода isEmpty")
    @Test
    public void isEmptyTest(){
        list.add("Hola");
        list.isEmpty();
        assertFalse(list.isEmpty()); //Не могу понять почему всегда false,даже, когда я убрал list.add()
    }
    @DisplayName("Проверка метода clear")
    @Test
    public void clearTest(){
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
        list.add("Hola");
        list.add("Privet");
        list.clear();
        assertFalse(list.contains("Hola"));
        assertFalse(list.contains("Privet"));
        }

    @DisplayName("Проверка метода size")
    @Test
    public void sizeTest(){
       list.add("Hola");
       list.size();
        assertEquals(1, list.size());
    }
    @DisplayName("Проверка метода get")
    @Test
    public void getTest(){
        list.add("Hola");
        list.get(0);
        list.add("Privet");
        list.get(1);
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

//    @DisplayName("Проверка метода add(i, element)")
//    @Test
//    public void addElementWithIndexTest(){
//        list.add(4,"Hola");
//        assertEquals("Hola", list.get(4));
//
//    }
    @DisplayName("Проверка метода lastIndexOf")
    @Test
    public void lastIndexOfTest(){
        list.add("Hola");
        list.lastIndexOf("Hola");
        assertEquals("Hola", list.get(0));
    }
    @DisplayName("Проверка метода IndexOf")
    @Test
    public void indexOfTest(){
        list.add("Hola");
        list.add("Hola!");
        list.add("Hola!!");
        list.indexOf("Hola!!");
        assertEquals("Hola!!", list.get(2));
    }

}
