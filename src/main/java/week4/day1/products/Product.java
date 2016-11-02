package week4.day1.products;

/**
 * Created by Дмитрий on 29.10.2016.
 */
public class Product implements Comparable{

    private String name;
    private String price;

    public Product(){}

    public Product (String name){
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
