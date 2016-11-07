package design_patterns.decorator;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class Milk extends Component{

    public Milk(String name, int price, Beverage beverage) {
        super(name, price, beverage);
    }

    @Override
    public String getName() {
        return super.getName() + " " + beverage.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + beverage.getPrice();
    }

}
