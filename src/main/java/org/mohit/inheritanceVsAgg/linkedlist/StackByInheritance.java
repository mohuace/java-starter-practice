package org.mohit.inheritanceVsAgg.linkedlist;

public class StackByInheritance extends Linkedlist {
    //Here you are extending linked list.
    //And practically saying Stack IS-A LinkedList.
    //This is not true, hence there could be potential issues as mentioned in the main method.

    public void push(Object data) {
        insertAtFront(data);
    }

    public Object pop() {
        if(isEmpty()) {
            return null;
        }

        return deleteFromFront();
    }
}
