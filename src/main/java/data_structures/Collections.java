package data_structures;

/**
 * Created by Дмитрий on 10.11.2016.
 */
public interface Collections<E> extends Iterable<E>{

    int size();
    boolean isEmpty();
    boolean contains(E e);
    <T> T[] toArray(T[] a);
    boolean add(E e);
    boolean remove(E e);
    boolean clear();

}
