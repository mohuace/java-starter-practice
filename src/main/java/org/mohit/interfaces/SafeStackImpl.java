package org.mohit.interfaces;

public class SafeStackImpl extends StackImpl implements ISafeStack{
    @Override
    public boolean isEmpty() {
        return tos < 0;
    }

    @Override
    public boolean isFull() {
        return tos == capacity - 1;
    }

    @Override
    public boolean testMethod() {
        return true;
    }
}
