package week4.day1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Created by Дмитрий on 29.10.2016.
 */


public class BinarySearchTest {

    ArrayList<String> arrayList;
    LinkedList<String> linkedList;

    @Before
    public void init(){
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    @After
    public void shutDown(){
        arrayList = null;
        linkedList = null;
    }

    @Test
    public void testBinarySearchArrayListNoPairAmountOfElements(){

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("F");

        boolean actual = BinarySearch.binarySearch(arrayList,"D");

        Assert.assertTrue(actual);

    }

    @Test
    public void testBinarySearchArrayListPairAmountOfElements(){

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        boolean actual = BinarySearch.binarySearch(arrayList, "A");

        Assert.assertTrue(actual);

    }

    @Test
    public void testBinarySearchArrayListIfListIsEmpty(){

        boolean actual = BinarySearch.binarySearch(arrayList, "AAA");

        Assert.assertFalse(actual);
    }

    @Test
    public void testBinarySearchLinkedListNoPairAmountOfElements(){

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("F");

        boolean actual = BinarySearch.binarySearch(linkedList,"A");

        Assert.assertTrue(actual);

    }

    @Test
    public void testBinarySearchLinkedListPairAmountOfElements(){

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("F");

        boolean actual = BinarySearch.binarySearch(linkedList,"E");

        Assert.assertTrue(actual);
    }

    @Test
    public void testBinarySearchLinkedListIfIsEmpty(){

        boolean actual = BinarySearch.binarySearch(linkedList,"AAA");

        Assert.assertFalse(actual);

    }



}