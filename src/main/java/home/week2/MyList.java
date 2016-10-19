package home.week2;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public interface MyList {

    boolean add(Object o);
    boolean add(int index, Object o);
    boolean clear();
    Object contains(Object o);
    Object get(int index);
    int indexOf(Object o);
    boolean isEmpty(Object o);
    int lastIndexOf(Object o);
    boolean remove(int index);
    boolean remove(Object o);
    boolean set(int index, Object o);
    int size();
    Object[] toArray();

}
