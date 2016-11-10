package data_structures.set;

/**
 * Created by Дмитрий on 10.11.2016.
 */
public interface NavigatableSet<E> extends SortedSet<E>{

    E lower(E e);
    E floor(E e);
    E ceiling(E e);
    E higher(E e);
    E pollFirst();
    E pollLast();

}
