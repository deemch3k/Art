package week5.clone;

/**
 * Created by Дмитрий on 05.11.2016.
 */
public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Man man = new Man("John",25);

        Woman woman = new Woman("Eva",30);
        Person alan = new Child("Alan",10);
        woman.setChild((Child) alan);
        man.setWife(woman);
        Person clone = man.clone();

        System.out.println(man + " Man");
        System.out.println(clone + " Clone");

        System.out.println(man == clone);
        System.out.println(man.getName() == clone.getName());

        man.setName("Jack");

        woman.setName("Angelika");

        System.out.println("Man after women change name - " + man);
        System.out.println("Clone after change women name - " + clone);

        woman.setChild(new Child("Kevin",12));

        System.out.println("***************************************");

        System.out.println("Man after women change child - " + man);
        System.out.println("Clone after change women child - " + clone);


    }

}
