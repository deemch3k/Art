package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Tamer extends Artist {

    public Tamer(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I am Tamer");
    }
}
