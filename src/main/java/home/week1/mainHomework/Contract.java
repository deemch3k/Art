package home.week1.mainHomework;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Contract extends Student {

    private int period;

    public Contract(String name, String surname, double awg, int period) {
        super(name, surname, awg);
        this.period = period;
    }
}