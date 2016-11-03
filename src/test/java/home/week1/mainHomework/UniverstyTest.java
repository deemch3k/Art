package home.week1.mainHomework;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий on 02.11.2016.
 */
public class UniverstyTest {

    @Test
    public void cloneTest() throws Exception {

        University universty = new University("University");
        Group group = new Group("Group");

        group.addStudent(new Student("Dima","Surname",4.22));
        group.addStudent(new Student("Anton","Surname",4.42));
        group.addStudent(new Student("Vlad","Surname",4.12));

        universty.addGroup(group);

        University universty1 = (University) universty.clone();

        Assert.assertFalse(universty.getGroups() == universty1.getGroups());

    }
}