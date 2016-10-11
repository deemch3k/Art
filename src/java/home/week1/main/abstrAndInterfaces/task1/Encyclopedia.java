package home.week1.main.abstrAndInterfaces.task1;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Encyclopedia extends Book{


    @Override
    public void read() {
        System.out.println("Start read an Encyclopedia");
    }

    @Override
    public void printDescriptionAboutBook() {
        System.out.println("Some words about Encyclopedia");
    }
}
