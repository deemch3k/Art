package scr.week1.day2.indiv;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Student st1 = new Budget("Kolia", "Burlak", 4.11,3500);
        Student st2 = new Budget("Nadya", "Yaroshevska", 4.21,3500);
        Student st3 = new Budget("Danil", "Ishytin", 4.91,6500);

        Student s4 = new Contract("Oleg","Berezhkov",3.55,2);
        Student s5 = new Contract("Dima","Belov",3.75,2);
        Student s6 = new Contract("Ivan","Simonenko",3.55,2);

        Group gr1 = new Group("217");
        Group gr2 = new Group("117");

        gr1.addStudent(st1);
        gr1.addStudent(st3);
        gr1.addStudent(s6);

        gr2.addStudent(st2);
        gr2.addStudent(s4);
        gr2.addStudent(s5);

        Universty universty = new Universty("KNEY");
        universty.addGroup(gr2);
        universty.addGroup(gr1);

//        printGroup(universty.getGroups());


    }

//    public static void printGroup(Group[] groups){
//        for (int i = 0; i < groups.length; i++) {
//            System.out.println(groups[i]);
//        }
//    }

}
