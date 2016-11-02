package home.week2;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public interface MyList<T> extends Iterable<T> {

    boolean add(T o);
    boolean add(int index, T o);
    boolean clear();
    boolean contains(T o);
    T get(int index);
    int indexOf(T o);
    boolean isEmpty();
    int lastIndexOf(T o);
    boolean remove(int index);
    boolean remove(T o);
    boolean set(int index, T o);
    int size();
    Object[] toArray();

}
