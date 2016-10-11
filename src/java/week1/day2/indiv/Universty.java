package scr.week1.day2.indiv;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Universty {

    private String name;
    private Group[] groups;
    private int grCount;

    public Universty(String name) {
        this.name = name;
        groups = new Group[10];
        grCount = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addGroup(Group group){
        if(group == null || grCount == groups.length){
            return false;
        }

        groups[grCount] = group;
        grCount++;

        return true;
    }

    public boolean deleteGroup(String name){
        int minGroups = 5;
        int tempCount = 0;
        if(groups.length == 0 || groups.length - 1 < minGroups) return false;
        Group[] tempGroup = new Group[groups.length-1];
        for (int i = 0; i < groups.length; i++) {
            if(!groups[i].getName().equals(name)){
                tempGroup[tempCount] = groups[i];
                tempCount++;
            }
        }
        groups = tempGroup;
        return true;
    }

    public Group[] getGroups() {
        return groups;
    }
}
