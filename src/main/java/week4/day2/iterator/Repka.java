package week4.day2.iterator;

import week4.day1.products.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class Repka implements Iterable<Product> {

    private List<Product> productList = new ArrayList<>();

    public boolean addProduct(Product product) {
        if (product == null) return false;
        return productList.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return new RepkaIterator();
    }

    private class RepkaIterator implements Iterator<Product> {

        private int currentPos;

        @Override
        public boolean hasNext() {
            return currentPos < productList.size();
        }

        @Override
        public Product next() {
            return productList.get(currentPos++);
        }
    }
}


