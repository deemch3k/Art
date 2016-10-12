package home.week1.main.myArrayList;

import java.util.Arrays;

/**
 * Created by Дмитрий on 12.10.2016.
 */
public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] objects;
    private int size;

    public MyArrayList() {
        objects = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int capacity) {
        objects = new Object[capacity];
        size = 0;
    }

    private void growArray(int newSize) {
        if (objects.length < newSize) {
            objects = Arrays.copyOf(objects, getNewCapacity());
        }
    }

    private int getNewCapacity() {
        return objects.length + DEFAULT_CAPACITY;
    }

    public boolean add(Object o) {

        if (o == null) return false;

        growArray(size + 1);
        objects[size++] = o;
        return true;

    }

    private void checkIndex(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Нету такого индекса");
    }

    public boolean add(int index, Object o) {
        if (o == null) return false;

        checkIndex(index);
        int temp = size + 1;
        growArray(temp);

        System.arraycopy(objects, index, objects, index + 1, temp - index);

        objects[index] = o;
        size = temp;

        return true;

    }

    public Object get(int index) {
        checkIndex(index);
        return objects[index];
    }

    public boolean remove(int index) {

        checkIndex(index);

        System.arraycopy(objects, index + 1, objects, index, size - index);

        size--;

        return true;

    }

    public boolean remove(int index, Object o) {

        if (o == null) return false;

        checkIndex(index);

        if (objects[index].equals(o)) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    public boolean set(int index, Object o) {

        if (o == null) return false;

        checkIndex(index);

        objects[index] = o;

        return true;
    }

    public boolean clear() {

        objects = new Object[DEFAULT_CAPACITY];
        size = 0;
        return true;

    }

    public boolean contains(Object o) {

        if (o == null) return false;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }
}
