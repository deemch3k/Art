package week3;

import data_structures.list.MyLinkedList;

import java.util.LinkedList;

/**
 * Created by Дмитрий on 30.10.2016.
 */
public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");

        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.add("C");
        myLinkedList.add("D");
        myLinkedList.add("E");


        for(String s : myLinkedList){
            System.out.println(s);
        }

    }

}
