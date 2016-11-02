package week4.day1.products;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class Test {

    public static void main(String[] args) {

        Product product = new Product();
        Camera camera = new Camera();
        Phone phone = new Phone();

        Container<Product> container = new Container<>();

        container.add(phone);

        List<Product> products = new ArrayList<>();
        List<Camera> camers = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();

        Utils.find(products,product);
        Utils.find(camers,camera);

    }

}
