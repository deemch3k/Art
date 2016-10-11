package week1.day2.indiv;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Budget extends Student {

    private long scolarship;

    public Budget(String name, String surname, double awg, long scolarship) {
        super(name, surname, awg);
        this.scolarship = scolarship;
    }
}
