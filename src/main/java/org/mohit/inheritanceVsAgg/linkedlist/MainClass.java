package org.mohit.inheritanceVsAgg.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        //These are queues

        QueueByAggregation queueByAggregation = new QueueByAggregation();

        String str = "Queues are boring to stand in";

        int queueLen = str.length();

        for(int i = 0 ; i < queueLen ; i++) {
            queueByAggregation.enqueue(new Character(str.charAt(i)));
        }

        while(!queueByAggregation.isEmpty()) {
            System.out.print(queueByAggregation.dequeue());
        }

        System.out.println();

        //Now stacks

        StackByInheritance stack = new StackByInheritance();

        String str1 = "doog si kcats";

        int stackLen = str1.length();

        for(int i = 0 ; i < stackLen ; i++) {
            stack.push(new Character(str1.charAt(i)));
        }

        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        //Not a stack operation
        //But still somehow we are allowed to do this because you have defined stack IS-A linked list
        //so technically we should be allowed to use all methods of linked list which is obviously wrong
        //Hence, aggregation is the right choice to use here instead of inheritance
        //stack.insertAtEnd(any data);

        System.out.println();
    }
}
