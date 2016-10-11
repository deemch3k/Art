package home.week1.main.abstrAndInterfaces.task1;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Handbook extends Book {
    @Override
    public void printDescriptionAboutBook() {
        System.out.println("Some words about Handbook");
    }

    @Override
    public void read() {
        System.out.println("Start read a Handbook");
    }
}
