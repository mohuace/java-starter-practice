package org.mohit.interfaces;

public interface IStack {

    //Static methods are used for providing some default implementations,
    //that is not specific to any class that would be implementing it
    static void someMethod() {
        System.out.println("This is a static method of the interface");
    }

    //Methods inside interfaces are public and abstract by default
    //Why? abstract because the class that will implement the interface
    //will provide implementation by overriding the method. And,
    //public because interfaces are common across hierarchies, they are meant
    //to be implemented by any class.
    void push(Object o);
    //This translates to
    //public abstract void push(Object o);

    Object pop();
}
