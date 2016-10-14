package home.week1.main.myArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Дмитрий on 12.10.2016.
 */
public class MyArrayListTest {

    private static MyArrayList list;

    @Before
    public void init(){
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
        int expected = 3;
        list.remove(0);
        int actual = list.size();
        assertEquals(expected,actual);
    }
}
