package design_patterns.decorator;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Beverage {

    private String name;
    private double price;

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

