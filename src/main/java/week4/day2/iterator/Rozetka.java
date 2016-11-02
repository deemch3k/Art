package week4.day2.iterator;

import week4.day1.products.Product;

import java.util.Iterator;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class Rozetka implements Iterable<Product> {

    private Product[] products = new Product[10];
    private int size;

    public int getSize() {
        return size;
    }


    public boolean addProduct(Product product) {

        if (product == null || products.length == size) return false;
        products[size++] = product;
        return true;

    }

    @Override
    public Iterator<Product> iterator() {
        return new RozetkaIterator();
    }

    private class RozetkaIterator implements Iterator<Product> {

        private int currentPos;

        @Override
        public boolean hasNext() {
            return currentPos < size;
        }

        @Override
        public Product next() {
            return products[currentPos++];
        }

    }
}
