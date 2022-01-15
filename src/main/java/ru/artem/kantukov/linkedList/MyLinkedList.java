package ru.artem.kantukov.linkedList;

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
        curNode = curNode.getNext();}
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

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public String toString() {
        return "MyLinkedList {" + "head : " + head + " }";
    }
}
