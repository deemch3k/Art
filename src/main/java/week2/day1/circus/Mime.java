package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Mime extends Clown {
    public Mime(String name) {
        super(name);
    }

    @Override
    public void act(){
        System.out.println("I am Mime");
    }

    public void stay(){
        System.out.println("Mime is staying");
    }

}
