package org.mohit.interfaces;

import java.util.ArrayList;
import java.util.List;

public class StackImpl implements IStack {

    List<Object> stackArr = new ArrayList<>();

    int capacity = 3;

    //Top of stack
    int tos = -1;

    //Here List size is always increasing as we add elements
    //But i am just playing with the index


    //Add method will shift positions if there is any element already present in that index
    //So need to check if element already exists, then replace (set), otherwise just do a simple
    //add
    @Override
    //If you try to make this private or protected, it won't allow because you are breaking
    //the contract. Interface says the push method should be public and then u cannot override
    //and assign weaker privileges to it.
    public void push(Object o) {
        if(tos + 1 >= 0 && tos + 1 < stackArr.size()) {
            //We don't need to check if there is an element at tos + 1
            //Because arraylist is dynamic, we can check if tos + 1 is within the range of the list size
            //so if tos is at the last element, the above condition will be false and new element will be added
            //otherwise there would already be an element one position ahead, and we will simply replace that element
            //if(stackArr.contains(stackArr.get(tos + 1))) {
                stackArr.set(++tos, o);
                return;
            //}
        }
        stackArr.add(++tos, o);
    }

    @Override
    public Object pop() {
        return stackArr.get(tos--);
    }
}
