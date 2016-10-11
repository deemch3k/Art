package week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Middle extends Coder {

    public Middle(String name, String surname, String programingLanguage) {
        super(name, surname, programingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I am Middle");
    }

    @Override
    public String toString() {
        return super.toString() + " Middle";
    }
}
