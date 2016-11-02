package home.week4;

/**
 * Created by Дмитрий on 02.11.2016.
 */
public interface MyQueue<E> {

    boolean add(E e);
    E element();
    boolean offer(E e);
    E peek();
    E poll();
    E remove();

}
