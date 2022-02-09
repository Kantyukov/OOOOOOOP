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
            for (Object value : array) {
                if (value == null) {
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
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }
        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        realSize--;
        return true;
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;

            realSize = 0;
        }
    }

    public Object get(int index) {

        return array[index];
    }

    public void set(int index, Object element) {
        Objects.checkIndex(index, array.length);
        array[index] = element;

    }

    public void add(int index, Object element) {
        if (realSize >= array.length) { /* Если значение реал сайз становится больше размера массива, мы его увеличиваем на значение
    в скобках и создаем новый массив, где предыдущий массив копируем в 2 "захода", до добавляемого элемента и после
    где сдвигает на один вперед все индексы */
            realSize++;
            Object[] resArray = new Object[3 * 2 * array.length + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            System.arraycopy(array, index, resArray, index + 1, array.length - index);
            array = resArray;
            array[index] = element;
        } else {/*если же наш массив меньше мы его увеличиваем на 1 и добавляем наш элемент в массив в нужную часть и все */
            realSize++;

            Object[] resArray = new Object[array.length];
            if (index >= 0) System.arraycopy(array, 0, resArray, 0, index);

            if (realSize - (index + 1) >= 0)
                System.arraycopy(array, index + 1 - 1, resArray, index + 1, realSize - (index + 1));

            resArray[index] = element;

            array = resArray;
            System.out.println("Element is added");


             /* System.arraycopy(array, index, array, index + 1, array.length - index); array[index] = element;*/
        }
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
            for (int i = 0; i < realSize; i++) {
                if (o.equals(array[i])) {
                    return i;
                }
            }
            throw new ObjectNotValidException("Не найден объект");
        }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = array.length - 1; i >= 0; i--)
                if (array[i] == null)
                    return i;
        } else {
            for (int i = array.length - 1; i >= 0; i--)
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
