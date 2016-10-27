package week3;

import home.week2.MyList;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class MyLinkedList<T> implements MyList<T> {

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public MyLinkedList() {
    }


    @Override
    public boolean add(T o) {

        if (tail == null) {
            head = tail = new Node<>(o);
            size++;
            return true;
        }

        tail.setNext(new Node<>(tail, o));
        tail = tail.getNext();
        size++;

        return true;
    }

    @Override
    public boolean add(int index, T o) {

        checkIndex(index);

        if (index == size - 1) {
            add(o);
        }
        Node<T> current = new Node<>(o);
        Node<T> temp = getNode(index - 1);
        temp.getNext().setPrev(current);
        current.setPrev(temp);
        current.setNext(temp.getNext());
        temp.setNext(current);

        return true;

    }

    @Override
    public boolean clear() {
        if (tail == null || head == null) return false;
        tail = null;
        head = null;
        return true;
    }

    @Override
    public boolean contains(T o) {

        for (int i = 0; i < size; i++) {

            if (getNode(i).getValue().equals(o)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public T get(int index) {
        checkIndex(index);

        Node<T> iterator = head;

        for (int i = 0; i <= size; i++) {
            iterator = iterator.getNext();
        }

        return iterator.getValue();
    }

    private Node<T> getNode(int index) {

        checkIndex(index);

        Node<T> iterator = head;

        for (int i = 0; i <= index; i++) {

            iterator = iterator.getNext();

        }

        return iterator;

    }

    private void checkIndex(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

    }

    @Override
    public int indexOf(T o) {

        for (int i = 0; i < size; i++) {

            if (getNode(i).getValue().equals(o)) {
                return i;
            }

        }
        return -1;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int lastIndexOf(Object o) {

        for (int i = size; i < 0; i--) {

            if (getNode(i).getValue().equals(o)) {
                return i;
            }

        }
        return -1;
    }

    @Override
    public boolean remove(int index) {

        checkIndex(index);

        Node<T> temp = getNode(index);

        temp.getPrev().setNext(temp.getNext());
        temp.getNext().setPrev(temp.getPrev());

        return true;

    }

    @Override
    public boolean remove(T o) {
        if (!contains(o)) {
            return false;
        }

        for (int i = 0; i < size; i++) {

            if (getNode(i).getValue().equals(o)) {
                remove(i);
            }
        }
        return true;
    }

    @Override
    public boolean set(int index, T o) {

        checkIndex(index);

        remove(index);
        add(index, o);
        return true;
    }

    @Override
    public int size() {
        return size();
    }

    @Override
    public Object[] toArray() {

        Object[] objects = new Object[size];

        for (int i = 0; i < size; i++) {

            objects[i] = getNode(i).getValue();

        }
        return objects;
    }


     private class Node <T> {

        private Node next;
        private Node prev;
        private T value;

        public Node(Node next, Node prev, T value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

         Node(T value) {
            this.value = value;
        }

         Node(Node prev, T value) {
            this.prev = prev;
            this.value = value;
        }

         Node<T> getNext() {
            return next;
        }

         void setNext(Node next) {
            this.next = next;
        }

         Node<T> getPrev() {
            return prev;
        }

         void setPrev(Node prev) {
            this.prev = prev;
        }

         T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }


}
