package data_structures.set;


import java.util.Comparator;

/**
 * Created by Дмитрий on 10.11.2016.
 */
public interface SortedSet<E> extends Set<E>{

    Comparator<? super E> comparator();
    E first();
    E last();

}
