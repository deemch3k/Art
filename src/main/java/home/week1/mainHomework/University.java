package home.week1.mainHomework;

/**
 * Created by Дмитрий on 11.10.2016.
 */

    public class University implements Cloneable{

    private String name;
    private Group[] groups;
    private int grCount;

    public University(String name) {
        this.name = name;
        groups = new Group[10];
        grCount = 0;
    }

    private void setGroups(Group[] groups) {
        this.groups = groups;
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
    public boolean deleteGroup(String name){
        int groupIndex = 0;
        if (groups.length == 0 || name == null) return false;

        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null && groups[i].getName().equals(name)) {
                groups[i] = null;
                groupIndex = i;
            }
        }
        groups[groupIndex] = groups[grCount - 1];
        groups[--grCount] = null;
        return true;
    }

    public Group[] getGroups() {
        return groups;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        University university = new University(name);
        Group[] groupsClone = new Group[grCount];

        for (int i = 0; i < grCount; i++) {
            groupsClone[i] = groups[i].clone();
        }

        university.setGroups(groupsClone);
        return university;
    }
}

