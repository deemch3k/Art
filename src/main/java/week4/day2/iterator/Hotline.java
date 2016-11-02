package week4.day2.iterator;

import week4.day1.products.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class Hotline {

    private List<Product> products = new LinkedList<>();

    public void addProducts(Iterable<Product> iterable){

        Iterator<Product> iterator = iterable.iterator();

        while(iterator.hasNext()){
            products.add(iterator.next());
        }

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hotline{");
        sb.append("products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
