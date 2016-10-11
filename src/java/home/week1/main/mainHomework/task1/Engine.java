package home.week1.main.mainHomework.task1;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Engine {

    private int number;
    private String color;

    public Engine(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public void startTheEngine(){
        System.out.println("Brr..");
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
