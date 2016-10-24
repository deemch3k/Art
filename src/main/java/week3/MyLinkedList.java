package week3;

import home.week2.MyList;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class MyLinkedList implements MyList {

    private int size;
    private Node head;
    private Node tail;

    public MyLinkedList() {
    }



    @Override
    public boolean add(Object o) {

        if(tail == null){
            head = tail = new Node(o);
            size++;
            return true;
        }

        tail.setNext(new Node(tail,o));
        tail = tail.getNext();
        size++;

        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public Object contains(Object o) {
        return null;
    }

    @Override
    public Object get(int index) {

        checkIndex(index);

        Node iterator = head;

        for (int i = 0; i <= index; i++) {

        iterator = iterator.getNext();

        }

        return iterator.getValue();

    }

    private void checkIndex(int index) {

        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty(Object o) {
        return size == 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean set(int index, Object o) {
        return false;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
