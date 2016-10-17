package week2.day1.circus;

/**
 * Created by Дмитрий on 15.10.2016.
 */
public class ClownRopeWalker extends Clown implements Ropewalkerable {

    public ClownRopeWalker(String name) {
        super(name);
    }

    @Override
    public void walkATightrope() {
        System.out.println(getName() + "Ходит по канату как клоун");
    }
}
