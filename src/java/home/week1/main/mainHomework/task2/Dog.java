package home.week1.main.mainHomework.task2;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Dog extends Animal{
    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    public void jump(){
        System.out.println("СОбака прыгает");
    }

    public void run(){
        System.out.println("Собака бежит");
    }

    public void bite(){
        System.out.println("Собака кусает");
    }

}
