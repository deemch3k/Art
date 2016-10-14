package home.week1.main.mainHomework;

import java.util.Arrays;

/**
 * Created by Дмитрий on 11.10.2016.
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

        for (int i = 0; i < stCount; i++) {
            if(students[i].equals(student)){
                return false;
            }
        }

        students[stCount++] = student;

        return true;

    }

    public boolean deleteStudent(String surname) {
        int tempIndex = 0;
        int tempCount = 0;
        if (students.length == 0) return false;

        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                tempCount++;
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].getSurname().equals(surname) && students[i] != null) {
                students[i] = null;
                tempIndex = i;
            }
        }
        Student tempStudent = students[tempCount];
        students[tempCount] = null;
        students[tempIndex] = tempStudent;
        return true;

    }

    public Student findStudent(String surname) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getSurname().equals(surname)) {
                return students[i];
            }
        }
        return null;
    }

    public Student[] sortStudents() {
        Arrays.sort(students);
        return students;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return name != null ? name.equals(group.name) : group.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}

