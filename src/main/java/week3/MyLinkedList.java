package week3;

import home.week2.MyList;
import home.week4.MyDeque;

import java.util.Iterator;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class MyLinkedList<T> implements MyList<T>,MyDeque<T> {

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

        for (int i = 0; i < index; i++) {
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
    public int lastIndexOf(T o) {

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

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator() ;
    }

    @Override
    public T element() {
        return get(0);
    }

    @Override
    public boolean offer(T o) {
        add(o);
        return true;
    }

    @Override
    public T peek() {
        if(checkSize()){
            return null;
        } else {
            return element();
        }
    }

    private boolean checkSize(){
        if(size == 0) return true;
        return false;
    }

    @Override
    public T poll() {
        if(checkSize()){
            return null;
        } else {
            return remove();
        }
    }

    @Override
    public T remove() {
        T temp = get(0);
        remove(0);
        return temp;
    }

    @Override
    public boolean addFirst(T t) {
       return add(0,t);
    }

    @Override
    public boolean addLast(T t) {
        return add(t);
    }

    @Override
    public T getFirst() {
        return get(0);
    }

    @Override
    public T getLast() {
        return get(size - 1);
    }

    @Override
    public boolean offerFirst(T t) {
        return addFirst(t);
    }

    @Override
    public boolean offerLast(T t) {
        return addLast(t);
    }

    @Override
    public T peekFirst() {
        if(checkSize()){
            return null;
        } else {
            return getFirst();
        }
    }

    @Override
    public T peekLast() {
        if(checkSize()){
            return null;
        } else {
            return getLast();
        }
    }

    @Override
    public T pollFirst() {
        if(checkSize()){
            return null;
        } else {
           return removeFirst();
        }
    }

    @Override
    public T pollLast() {
        if(checkSize()){
            return null;
        } else {
            return removeLast();
        }
    }

    @Override
    public boolean push(T t) {
        return addLast(t);
    }

    @Override
    public T removeFirst() {
        T temp = getFirst();
        remove(0);
        return temp;
    }

    @Override
    public T removeLast() {
        T temp = getLast();
        remove(size - 1);
        return temp;
    }


    private static class Node <T> {

        private Node<T> next;
        private Node<T> prev;
        private T value;

        public Node(Node<T> next, Node<T> prev, T value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

        public Node(){}

         Node(T value) {
            this.value = value;
        }

         Node(Node<T> prev, T value) {
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


    private class MyLinkedListIterator implements Iterator<T> {

        private Node<T> iterator;

        public MyLinkedListIterator() {
            iterator = new Node<>();
            iterator.next = head;
        }

        @Override
        public boolean hasNext() {

            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }
    }
}
