package week3.day1;

import home.week1.mainHomework.Student;

import java.util.Arrays;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class FinalWord {

    private final String name;
    private final int age;
    private final Student[] students;

    public FinalWord(String name, int age, Student[] students) {
        this.name = name;
        this.age = age;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FinalWord{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", students=").append(students == null ? "null" : Arrays.asList(students).toString());
        sb.append('}');
        return sb.toString();
    }
}
