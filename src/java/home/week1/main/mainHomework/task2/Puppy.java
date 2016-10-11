package home.week1.main.mainHomework.task2;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Puppy extends Dog{

    @Override
    public void voice() {
        System.out.println("Щенок лает");
    }

    @Override
    public void jump() {
        System.out.println("Щенок прыгает");
    }

    @Override
    public void run() {
        System.out.println("Щенок бежит");
    }

    @Override
    public void bite() {
        System.out.println("Щенок кусает");
    }
}
