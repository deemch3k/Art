package home.week1.abstrAndInterfaces.task2;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Surgeon implements Doctor {
    @Override
    public void heal() {
        System.out.println("healing as Surgeon");
    }

    @Override
    public void prescribePills() {
        System.out.println("prescribe surgical pills");
    }
}
