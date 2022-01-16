package ru.artem.kantukov.linkedList;

import java.util.Objects;

public class MyLinkedList {
    private Node head;


    public int size() {
        Node curNode = head;
        int realSize = 1; //только пока не понял почему 1 или я что-то делаю не так
        if (head == null) return 0;
        else {
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                realSize++;
            }
        }
        return realSize;
    }

    public boolean isEmpty() {
        if (head != null) return false;
        else return true;
    }

    public boolean contains(Object o) {
        Node curNode = head;
        while (curNode != null) {
            if (curNode.getValue().equals(o)) return true;
            curNode = curNode.getNext();
        }
        return false;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
            return true;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

        if (head == null) {

        }
    }

    public Object get(int index) {
        checkIndex(index);
        Node curNode = head;
        int count = 0;
        if (curNode == null && index == 0) {
            return null;
        }
        if (index == 0) {
            return head.getValue();
        }
        while ((curNode = curNode.getNext()) != null) {
            count++;
            if (count == index) {
                break;
            }
        }
        return curNode.getValue();
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        int count = 0;
        Node resNode = new Node(element, null);
        Node curNode= head;;
        if (head == null) {
            head = resNode;
            return resNode;
        } else {
             while (curNode.getNext() != null) {
                count++;

                if (count == index) {
                    break;
                }
                 curNode = curNode.getNext();
            }
        }curNode.setNext(resNode);

        return curNode.getNext();
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public Object remove(int index) {
        checkIndex(index); // Проверка корректности инекса
        if (index == 0) { // Удаление первого элемента
            Object resValue = head.getValue();
            if (head.getNext() == null) { // т.е. если у нас только один элемент, мы его зануляем
                head = null;
            } else { //Но если у нас не один элемент, мы удаляем первыйй элемент и стартуем от следующего
                head = head.getNext();
            }
            return resValue;

        }
        Node curNode = head; //Дальше мы определяем два значения, первый
        Node prevNode = head; // и предыдущий
        int count = 0;
        while ((curNode = curNode.getNext()) != null) { // Здесь мы бежим по коллекции,
            // пока следующий элемент не будет ноль
            count++;
            if (count == index) { //Мы бежим до тех пор, пока не дойдем до нужного индекса
                break;
            }
            prevNode = prevNode.getNext(); // А предыдущий бежит таким образом , что curNode = curNode.getNext()
            // prevNode = prevNode.getNext() (curNode)
        }
        Object resValue = curNode.getNext();
        if (curNode.getNext() == null) {  // Если удаляемый последний элемент, то мы зануляем последний элемент
            // И Зануляем связку предыдущего элемента
            // со следующим prevNode.setValue(null);
            prevNode.setValue(null);
        } else {                            // Если за ним есть элемент, то связываем предыдущий с последующим
            //  с помощью prevNode.setNext(curNode.getNext())
            prevNode.setNext(curNode.getNext());
            curNode.setNext(null);          // А значение удаляем
        }
        return resValue;
    }

    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректный индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        return (index > -1) || (index < size());
    }

    public String toString() {
        return "MyLinkedList {" + "head : " + head + " }";
    }
}
