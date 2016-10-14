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
    private Wheel[] wheels;

    public Car(int number, String color, String marka, Engine engine, Wheel[] wheels) {
        this.number = number;
        this.color = color;
        this.marka = marka;
        this.engine = engine;
        this.wheels = wheels;
    }

    private void checkWheels() throws WheelIsNotFoundException {
        for (int i = 0; i < wheels.length; i++) {
            if(wheels[i] == null){
                throw new WheelIsNotFoundException();
            }
        }
    }

    public void run() throws WheelIsNotFoundException {
        checkWheels();
        System.out.println("Машина поехала...");
    }

    public void printMarka(){
        System.out.println("marka = " + marka);
    }

    public void fillCar(){
        System.out.println("Машина заправляется");
    }

    public boolean changeWheel(Wheel wheel) throws WheelIsNotFoundException {
        if ( wheel == null) return false;
        checkWheels();
        setWheel(wheel);
        return true;
    }

    public boolean setWheel(Wheel wheel){
        if (wheel == null) return false;
        for (int i = 0; i < wheels.length; i++) {
            if(wheels[i] != null){
                wheels[i] = wheel;
            }
        }
        return true;
    }

    public void setWheels(Wheel[] wheels){
        this.wheels = wheels;
    }

    public void setEngine(Engine engine){
        if(engine == null){
            this.engine = engine;
        } else {
            System.out.println("Двигатель уже установлен");
        }
    }

    public Engine getEngine() {
        return engine;
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
