package home.week1.mainHomework;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Дмитрий on 02.11.2016.
 */
public class UniversityTest {

    @Test
    public void cloneTest() throws Exception {

        University university1 = new University("University");
        Group group = new Group("Group");

        group.addStudent(new Student("Dima","Surname",4.22));
        group.addStudent(new Student("Anton","Surname",4.42));
        group.addStudent(new Student("Vlad","Surname",4.12));

        university1.addGroup(group);

        University university = (University) university1.clone();

        Assert.assertFalse(university1.getGroups() == university.getGroups());

    }
}