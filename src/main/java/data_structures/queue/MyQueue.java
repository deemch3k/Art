package data_structures.queue;

import data_structures.Collections;
import home.week4.exceptions.ListIsEmptyException;

/**
 * Created by Дмитрий on 02.11.2016.
 */
public interface MyQueue<E> extends Collections<E>{

    boolean add(E e);
    E element() throws ListIsEmptyException;
    boolean offer(E e);
    E peek() throws ListIsEmptyException;
    E poll();
    E remove();

}
