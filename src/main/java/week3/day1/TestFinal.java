package week3.day1;

import home.week1.mainHomework.Student;

/**
 * Created by Дмитрий on 22.10.2016.
 */
public class TestFinal {

    public static void main(String[] args) {

        Student student1 = new Student("Name1","Surname1",1.54);
        Student student2 = new Student("Name2","Surname2",1.53);
        Student student3 = new Student("Name3","Surname3",1.52);
        Student student4 = new Student("Name4","Surname4",1.51);

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        FinalWord finalWord = new FinalWord("Name",15,students);

        System.out.println(finalWord);

        students[0] = new Student("Name100","SURNAME",7.42);

        System.out.println(finalWord);

    }

}
