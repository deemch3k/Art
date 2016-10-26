package week3;

/**
 * Created by Дмитрий on 26.10.2016.
 */
public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(new Node(20));
        Node o = new Node(25);
        myLinkedList.add(o);
        myLinkedList.add(new Node(30));
        myLinkedList.add(new Node(35));

        System.out.println(myLinkedList.get(1).getValue());

        o.setValue(128);

        System.out.println(myLinkedList.get(1).getValue());

    }

}
