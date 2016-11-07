package design_patterns.decorator;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public abstract class Component extends Beverage{

    protected Beverage beverage;

    public Component(String name, int price, Beverage beverage) {
        super(name,price);
        this.beverage = beverage;
    }
    @Override
    public double getPrice(){
        return super.getPrice();
    }

    @Override
    public String getName(){
     return super.getName();
    }
}
