package week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Junior extends Coder {

    public Junior(String name, String surname, String programingLanguage) {
        super(name, surname, programingLanguage);
    }

    @Override
    public void work() {
        System.out.println("I am Junior");
    }

    @Override
    public String toString() {
        return super.toString() + " Junior";
    }
}
