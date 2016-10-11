package home.week1.main.mainHomework;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Budget extends Student {

    private long scolarship;

    public Budget(String name, String surname, double awg, long scolarship) {
        super(name, surname, awg);
        this.scolarship = scolarship;
    }
}
