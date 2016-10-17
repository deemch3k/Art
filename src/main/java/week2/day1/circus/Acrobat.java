package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Acrobat extends Artist {

    public Acrobat(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I am acrobat");
    }
}
