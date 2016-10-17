package scr.week1.day2.indiv;

import java.util.Arrays;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Group {

    private String name;
    private Student[] students;
    private int stCount;

    public Group(String name) {
        this.name = name;
        stCount = 0;
        students = new Student[10];
    }

    public boolean addStudent(Student student) {
        if (student == null || stCount == students.length) return false;
        students[stCount] = student;
        stCount++;
        return true;
    }

    public boolean deleteStudent(String surname) {
        int minStudents = 5;
        int tempCount = 0;
        if (students.length == 0 || students.length - 1 < minStudents) return false;
        Student[] tempStudets = new Student[students.length - 1];
        for (int i = 0; i < students.length; i++) {
            if (!students[i].getSurname().equals(surname)) {
                tempStudets[tempCount] = students[i];
                tempCount++;
            }
        }
        students = tempStudets;
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Group{");


        sb.append("name='").append(name).append('\'');
        sb.append(", students=").append(Arrays.toString(students));
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
