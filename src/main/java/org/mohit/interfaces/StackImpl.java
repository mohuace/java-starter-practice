package org.mohit.interfaces;

import java.util.ArrayList;
import java.util.List;

public class StackImpl implements IStack {

    List<Object> stackArr = new ArrayList<>();

    //Top of stack
    int tos = -1;

    //Here List size is always increasing as we add elements
    //But i am just playing with the index


    @Override
    public void push(Object o) {
        stackArr.add(++tos, o);
    }

    @Override
    public Object pop() {
        return stackArr.get(tos--);
    }
}
