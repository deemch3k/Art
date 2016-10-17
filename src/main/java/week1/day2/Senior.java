package scr.week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Senior extends Coder {
    public Senior(String name, String surname, String programingLanguage) {
        super(name, surname, programingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I am Senior");
    }

    @Override
    public String toString() {
        return super.toString() + " Senior";
    }
}
