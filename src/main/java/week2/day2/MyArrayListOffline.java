package week2.day2;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class MyArrayListOffline {

    private Object[] elementData;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 3;

    public MyArrayListOffline(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListOffline(int capacity){
        elementData = new Object[capacity];
    }

    public boolean add(Object o){

        elementData[size++] = o;



        return true;
    }

    public int size() {
        return size;
    }
}
