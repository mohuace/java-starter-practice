package org.mohit.inheritanceVsAgg.linkedlist;

public class Linkedlist {
    protected Node head = null;
    protected Node tail = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtFront(Object data) {
        if(isEmpty()) {
            head = tail = new Node(data, null);
        }
        else {
            head = new Node(data, head);
        }
    }

    public void insertAtEnd(Object data) {
        if(isEmpty()) {
            head = tail = new Node(data, null);
        }

        else {
            tail.setNext(new Node(data, null));
            tail = tail.getNext();
        }
    }

    public Object deleteFromFront() {
        if(isEmpty()) {
            return null;
        }
        Object deletedObj = head.getData();
        if(head == tail) {
            head = tail = null;
        }
        else {
            head = head.getNext();
        }
        return deletedObj;
    }

}
