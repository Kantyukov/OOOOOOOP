package ru.artem.kantukov.arrayListPractice;


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
        return realSize == 0;
    }

    public boolean contains(Object o) {
         if (o != null) {
             for (Object value : array) {
                 if (o.equals(value)) {
                     return true;
                 }
             }
            } else {
             for (int  i = 0; i< array.length; i++) {
                    if (array[i] == null) {
                        return true;
                    }
                }
            }
            return false;
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
        for (int i = 0; i < array.length; i++){
            array[i] = null;

        realSize = 0;}
    }

    public Object get(int index) {

        return array[index];
    }

    public Object set(int index, Object element) {
        Objects.checkIndex(index, array.length);
        Object oldValue = array[index];
        array[index] = element;
        return oldValue;

    }

    public void add(int index, Object element) {
        realSize++;
        if (realSize == array.length){
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            System.arraycopy(array[index], 0, resArray, 0, array.length);
            array[index] = resArray;

        resArray[index] = element;}
        array[realSize++] = element;


    }

    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        return (index > -1) || (index < realSize);
    }

    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) return i;

        }
        throw new ObjectNotValidException("Не найден объект");
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = array.length-1; i >= 0; i--)
                if (array[i]==null)
                    return i;
        } else {
            for (int i = array.length-1; i >= 0; i--)
                if (o.equals(array[i]))
                    return i;
        }
        throw new ObjectNotValidException("Объект не найден");
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
