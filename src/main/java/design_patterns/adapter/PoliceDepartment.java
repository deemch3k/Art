package design_patterns.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 06.11.2016.
 */
public class PoliceDepartment {

    private List<Policeman> policemanList = new ArrayList<>();

    public PoliceDepartment() {
    }

    public boolean hirePoliceman(Policeman policeman){
        return policemanList.add(policeman);
    }

    public void startWorkingDay(){
        policemanList.forEach(Policeman::serve);
    }



}
