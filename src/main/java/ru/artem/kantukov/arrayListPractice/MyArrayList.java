package ru.artem.kantukov.arrayListPractice;


import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {

        return realSize;
    }

    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(realSize, array[i])) {
                return true;
            }else {
                return false;
            }
        }
        return realSize == 0;
    }

    public boolean contains(Object o) {

            return indexOf(o) >= 0;


    }

    public boolean add(Object o) {
        if (realSize == array.length) {

            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;

        }
        array[realSize++] = o;


        return true;
    }

    public boolean remove(Object o) {

        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)){
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        realSize++;

        for (int to = array.length, i = 0; i < to; i++){if (i == array.length){array[i] = null;
                    }}


    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "My array list{" + Arrays.toString(array)+  "}";
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
