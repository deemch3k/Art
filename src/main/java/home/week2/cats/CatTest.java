package home.week2.cats;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class CatTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Cat("SomeName");
        }

        new Cat("Name");

        Cat.printCats();

    }




}
