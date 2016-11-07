package design_patterns.adapter;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class TestCity {

    public static void main(String[] args) {

        PoliceDepartment policeDepartment = new PoliceDepartment();

        Policeman policeman1 = new Policeman();
        Policeman policeman2 = new Policeman();
        Policeman policeman3 = new Policeman();

        Militioner militioner1 = new Militioner();
        Militioner militioner2 = new Militioner();
        Militioner militioner3 = new Militioner();

        policeDepartment.hirePoliceman(policeman1);
        policeDepartment.hirePoliceman(policeman2);
        policeDepartment.hirePoliceman(policeman3);
        policeDepartment.hirePoliceman(new PolicemanAdapter(militioner1));
        policeDepartment.hirePoliceman(new PolicemanAdapter(militioner2));
        policeDepartment.hirePoliceman(new PolicemanAdapter(militioner3));

        policeDepartment.startWorkingDay();
    }


}
