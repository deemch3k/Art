package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class Ropewalker extends Acrobat implements Ropewalkerable {

    public Ropewalker(String name) {
        super(name);
    }

    @Override
    public void walkATightrope() {
        System.out.println(getName() + " Ходит по канату");
    }
}
