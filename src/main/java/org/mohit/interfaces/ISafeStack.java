package org.mohit.interfaces;

public interface ISafeStack extends IStack {
    boolean isEmpty();
    boolean isFull();

    @Override
    boolean testMethod();

    @Override
    default void doingSomething() {
        System.out.println("Doing something in safe stack");
    }
}
