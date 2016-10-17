package week2.day2;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий on 16.10.2016.
 */
public class MyArrayListOfflineTest {

    private MyArrayListOffline list;

    @Before
    public void init(){
        System.out.println("Before");
        list = new MyArrayListOffline();
    }

    @After
    public void tearDown(){
        list = null;
        System.out.println("After");
    }


    @Test
    public void add() throws Exception {

        System.out.println("Test1");

        boolean actual = list.add("1");

        Assert.assertTrue(actual);

    }

    @Test
    public void testMyArrayListOfflineAfterAdd(){

        System.out.println("Test2");

        list.add("1");

        int res = list.size();

        Assert.assertEquals(1,res);
    }

    @Test
    public void testMyArrayListOfflineAddTwoElements(){

        System.out.println("Test3");

        list.add("1");
        list.add("1");

        Assert.assertEquals(2,list.size());
    }


    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMyArrayListOfflineSizeAfterAddMoreThanCapacity(){

        System.out.println("Test4");

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");


    }

}