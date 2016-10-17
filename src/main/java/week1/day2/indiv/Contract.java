package scr.week1.day2.indiv;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Contract extends Student {

    private int period;

    public Contract(String name, String surname, double awg, int period) {
        super(name, surname, awg);
        this.period = period;
    }
}
