package home.week1.main.mainHomework;

/**
 * Created by Дмитрий on 11.10.2016.
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

        for (int i = 0; i < grCount; i++) {
            if(groups[i].equals(group)){
                return false;
            }
        }

        groups[grCount++] = group;

        return true;
    }
    //  TODO: simplify this method as in Group class
    public boolean deleteGroup(String name){
        int tempIndex = 0;
        int tempCount = 0;
        if (groups.length == 0) return false;

        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                tempCount++;
            }
        }

        for (int i = 0; i < groups.length; i++) {
            if (groups[i].getName().equals(name) && groups[i] != null) {
                groups[i] = null;
                tempIndex = i;
            }
        }
        Group tempGroup = groups[tempCount];
        groups[tempCount] = null;
        groups[tempIndex] = tempGroup;
        return true;
    }

    public Group[] getGroups() {
        return groups;
    }
}

