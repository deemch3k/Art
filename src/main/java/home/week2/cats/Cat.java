package home.week2.cats;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<>();
    public String name;


    public Cat(String name){
        this.name = name;
        cats.add(this);
    }

    public String getName() {
        return name;
    }

    public static void printCats(){
        for (int i = 0; i < Cat.cats.size(); i++) {
            System.out.print(Cat.cats.get(i).getName() + " ");
        }
    }

}
