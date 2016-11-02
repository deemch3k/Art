package week4.day1.products;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class Container<T extends Product> {

    private T item;

    public void add(T t){
        item = t;
    }

}
