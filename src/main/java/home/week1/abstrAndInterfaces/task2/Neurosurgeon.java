package home.week1.abstrAndInterfaces.task2;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Neurosurgeon implements Doctor{
    @Override
    public void heal() {
        System.out.println("healing as neurosurgeon");
    }

    @Override
    public void prescribePills() {
        System.out.println("prescrirbe neurosurgical pills ");
    }
}
