package home.week2.cats;

/**
 * Created by Дмитрий on 19.10.2016.
 */
public class CatTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat.cats.add(new Cat("SomeName"));
        }

        Cat.cats.add(new Cat("Name"));
        printCats();

    }

    public static void printCats(){
        for (int i = 0; i < Cat.cats.size(); i++) {
            System.out.print(Cat.cats.get(i).getName() + " ");
        }
    }

}
