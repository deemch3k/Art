package home.week1.main.mainHomework.task4;

import java.util.Arrays;

/**
 * Created by Дмитрий on 11.10.2016.
 */
public class Bouquet{

    private int price;
    private Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int getBouquetPrice(){
        int price = 0;
        for (int i = 0; i < flowers.length; i++) {
            price += flowers[i].getPrice();
        }
        return price;
    }

    public Flower[] sortFlowers(){
        for (int i = flowers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (flowers[j].getStemLenght() > flowers[j + 1].getStemLenght()) {
                    Flower t = flowers[j];
                    flowers[j] = flowers[j + 1];
                    flowers[j + 1] = t;
                }
            }
        }
        return flowers;
    }

    public Flower findFlower(int stemLenght){
        for (int i = 0; i < flowers.length; i++) {
            if(flowers[i].getStemLenght() == stemLenght){
                return flowers[i];
            }
        }
        return null;
    }



    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int getPrice() {
        return price;
    }
}
