package home.week1.main.mainHomework.task1;

import java.util.Scanner;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Car {

    private int number;
    private String color;
    private String marka;
    private Engine engine;
//todo    better use array
    private Wheel leftBackWheel;
    private Wheel leftFrontWheel;
    private Wheel rightBackWheel;
    private Wheel rightFrontWheel;

    public Car(int number, String color, String marka, Engine engine, Wheel leftBackWheel,
               Wheel rightBackWheel, Wheel leftFrontWheel, Wheel rightFrontWheel) {
        this.number = number;
        this.color = color;
        this.marka = marka;
        this.engine = engine;
        this.rightBackWheel = rightBackWheel;
        this.rightFrontWheel = rightFrontWheel;
        this.leftBackWheel = leftBackWheel;
        this.leftFrontWheel = leftFrontWheel;
    }

    public void run() {
        if (engine == null) {
            System.out.println("У вашей машины нету двигателя");
        }
        if (leftBackWheel == null) {
            System.out.println("У вашей машины нету левого заднего колеса");
        }
        if (leftFrontWheel == null) {
            System.out.println("У вашей машины нету левого переднего колеса");
        }
        if (rightFrontWheel == null) {
            System.out.println("У вашей машины нету правого переднего колеса");
        }
        if (rightBackWheel == null) {
            System.out.println("У вашей машины нету правого заднего колеса");
        }
        System.out.println("Ваша машина поехала");
    }

    public void printMarka(){
        System.out.println("marka = " + marka);
    }

    public void fillCar(){
        System.out.println("Машина заправляется");
    }

    public boolean changeWheel(Wheel wheel){
        System.out.println("Какое колесо вы хотите поменять ? \n" +
                "1 - Left back wheel\n" +
                "2 - Left front wheel\n" +
                "3 - Right back wheel\n" +
                "4 - Right front wheel");

        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        switch (choise){
            case 1: leftBackWheel = wheel;
            case 2: leftFrontWheel = wheel;
            case 3: rightBackWheel = wheel;
            case 4: rightFrontWheel = wheel;
        }

        return true;

    }

    public Engine getEngine() {
        return engine;
    }

    public Wheel getLeftBackWheel() {
        return leftBackWheel;
    }

    public Wheel getLeftFrontWheel() {
        return leftFrontWheel;
    }

    public Wheel getRightBackWheel() {
        return rightBackWheel;
    }

    public Wheel getRightFrontWheel() {
        return rightFrontWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
