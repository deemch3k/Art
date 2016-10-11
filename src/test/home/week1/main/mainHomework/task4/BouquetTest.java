package home.week1.main.mainHomework.task4;

import org.junit.Assert;
import org.junit.BeforeClass;


/**
 * Created by Дмитрий on 11.10.2016.
 */
public class BouquetTest {

   private static Bouquet bouquet;

    @BeforeClass
    public static void createBouquet(){
        Flower[] flowers = {new Tulip(5,3,10),new Rose(2,9,11),new Chamomile(3,10,5)};
        bouquet = new Bouquet(flowers);
    }

    @org.junit.Test
    public void getBouquetPrice() throws Exception {
        int expected = 26;
        int actual = bouquet.getBouquetPrice();
        Assert.assertEquals(expected,actual);

    }

    @org.junit.Test
    public void findFlower() throws Exception {
        Flower expected = new Rose(2,9,11);
        Flower actual = bouquet.findFlower(2);
        Assert.assertEquals(expected,actual);
    }

    @org.junit.Test
    public void findFlowerNull() throws Exception {
        Flower[] excepted = null;
        Flower actual = bouquet.findFlower(32132131);
        Assert.assertEquals(excepted,actual);
    }
}