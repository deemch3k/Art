package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Clown extends Artist {

    public Clown(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I am clown");
    }
}
