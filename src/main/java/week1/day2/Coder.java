package scr.week1.day2;

/**
 * Created by Дмитрий on 09.10.2016.
 */
public class Coder extends Employee{

    String programingLanguage;

    public Coder(String name, String surname,String programingLanguage) {
        super(name, surname);
        this.programingLanguage = programingLanguage;
    }

    public void code(){
        System.out.println("I am coding");
    }

    @Override
    public void work() {
        System.out.println("I'm coder, and I'm writing code");
    }

    @Override
    public String toString() {
        return super.toString() + "PL = " + programingLanguage;
    }
}
