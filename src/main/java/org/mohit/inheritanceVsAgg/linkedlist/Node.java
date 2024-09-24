package org.mohit.inheritanceVsAgg.linkedlist;

public class Node {
    private Object data;
    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node) {
        next = node;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
