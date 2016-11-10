package week3;

import data_structures.list.MyLinkedList;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class MyLinkedListIteratorTest {

    MyLinkedList<String> linkedList;

    @Before
    public void init(){
        linkedList = new MyLinkedList<>();
    }

    @After
    public void shutdown(){
        linkedList = null;
    }

    @Test
    public void testMyLinkedListIterator(){

        boolean actual = linkedList.iterator().hasNext();

        Assert.assertFalse(actual);

    }

    @Test
    public void testMyLinkedListIteratorHasNext(){

        linkedList.add("A");

        boolean actual = linkedList.iterator().hasNext();

        Assert.assertTrue(actual);

    }

}