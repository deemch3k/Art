package design_patterns.decorator;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class CreatreDrink {

    public static void main(String[] args) {

        Beverage beverage = new Sugar("Sugar",2,new Milk("Milk",6,new Espresso("Espresso",20)));

        System.out.println(beverage);

    }

}
