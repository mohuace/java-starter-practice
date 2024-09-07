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
}
