package week4.day2.iterator;

import week4.day1.products.Product;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class TestIterator {

    public static void main(String[] args) {

        Rozetka rozetka = new Rozetka();
        Repka repka = new Repka();

        Product product1 = new Product("Iphone");
        Product product2 = new Product("Samsung");
        Product product3 = new Product("Lenovo");
        Product product4 = new Product("Sony");

        repka.addProduct(product1);
        repka.addProduct(product2);

        rozetka.addProduct(product3);
        rozetka.addProduct(product4);

        Hotline hotline = new Hotline();

        System.out.println("BEFORE ADDING ROZETKA");
        System.out.println(hotline);
        System.out.println("AFTER ADDING ROZETKA");
        hotline.addProducts(rozetka);
        System.out.println(hotline);

    }

}
