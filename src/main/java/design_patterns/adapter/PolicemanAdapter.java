package design_patterns.adapter;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class PolicemanAdapter extends Policeman {

    private Militioner militioner;

    public PolicemanAdapter(String name, String rank, Militioner militioner) {
        super(name, rank);
        this.militioner = militioner;
    }

    public PolicemanAdapter(Militioner militioner) {
        this.militioner = militioner;
    }

    @Override
    public void serve() {
        militioner.takeBribes();
    }
}
