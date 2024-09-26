package org.mohit.inheritanceVsAgg.linkedlist;

public class QueueByAggregation {
    //Here i am using queue that HAS A linked list.
    //So here, client will only have access to the methods that are
    //provided by the queue. Can't use any other linked list
    //methods from outside this class because it is private.
    //So you are doing the right thing --- queue is not a linked list,
    //but queue has a Linked List.

    private Linkedlist qList;

    public QueueByAggregation() {
        this.qList = new Linkedlist();
    }

    public void enqueue(Object data) {
        qList.insertAtEnd(data);
    }

    public Object dequeue() {
        return qList.deleteFromFront();
    }

    public boolean isEmpty() {
        return qList.isEmpty();
    }
}
