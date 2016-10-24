package week3;

/**
 * Created by Дмитрий on 23.10.2016.
 */
public class Node {

    private Node next;
    private Node prev;
    private Object value;

    public Node(Node next, Node prev, Object value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Node(Object value) {
        this.value = value;
    }

    public Node(Node prev, Object value) {
        this.prev = prev;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
