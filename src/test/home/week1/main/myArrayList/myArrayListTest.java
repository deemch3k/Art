package home.week1.main.myArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий on 12.10.2016.
 */
public class myArrayListTest {

    private static MyArrayList list;

    @BeforeClass
    public static void initList(){
        list = new MyArrayList();
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
    }

    @Test
    public void testAdd() throws Exception {
        int expected = 5;
        list.add(new Object());
        int actual = list.size();
        assertEquals(expected,actual);
    }
    @Test
    public void testRemove() throws Exception {
        int expected = 4;
        list.remove(0);
        int actual = list.size();
        assertEquals(expected,actual);
    }
}