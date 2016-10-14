package home.week1.main.myArrayList;

import java.util.Arrays;

/**
 * Created by Дмитрий on 12.10.2016.
 */
public class MyArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] objects;
    private int size = 0;

    public MyArrayList() {
        objects = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        objects = new Object[capacity];
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
        growArray(size + 1);
        objects[size++] = o;
        return true;

    }

    private void checkIndex(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("Нету такого индекса");
    }

    public boolean add(int index, Object o) {
        checkIndex(index);
        int temp = size + 1;
        growArray(temp);

        System.arraycopy(objects, index, objects, index + 1, temp - index - 1);

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

        System.arraycopy(objects, index + 1, objects, index, size - index - 1);
// todo forgot remove last element after copy
        objects[--size] = null;

        return true;

    }

    public boolean remove(int index, Object o) {

        if (o == null) return false;

        checkIndex(index);

        if (o.equals(objects[index])) {
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

//        objects = new Object[DEFAULT_CAPACITY];

        for (int i = 0; i < size; i++) {
            objects[i] = null;
        }
        size = 0;
        return true;

    }

    public boolean contains(Object o) {

        if (o == null) return false;

        for (int i = 0; i < size; i++) {
            if (o.equals(objects[i])) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
