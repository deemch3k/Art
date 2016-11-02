package home.week4;

import java.util.Queue;

/**
 * Created by Дмитрий on 02.11.2016.
 */
public interface MyDeque<E> extends MyQueue<E>{

    boolean addFirst(E e);
    boolean addLast(E e);
    E getFirst();
    E getLast();
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E peekFirst();
    E peekLast();
    E pollFirst();
    E pollLast();
    boolean push(E e);
    E removeFirst();
    E removeLast();

}
