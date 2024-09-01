package org.mohit.constructorChaining;

public class Tubelight extends Light {

    private int colorNumber;
    private int tubeLength;

    //This is not working because when a subclass's constructor is called
    //The first thing that should happen is that the superclass should be invoked and initialized
    //So, here, type and watt are not initialized because the superclass is not yet called
    //The heirarchy is that the superclass needs to be initialized first before subclass is initialized
    //This is because the subclass inherits the properties of the parent class.
    public Tubelight() {
            this(123, 10, "abcType", 44);

            System.out.println("This is the tubelight default constructor ");
    }

    //Java doesn't allow this and super to be a part of the same constructor, because both of them need to
    //be the first statement in the constructor.

    //Every subclass constructor must call this() which is constructor chaining and the constructor
    //at the end of the this()-chain should either call super directly or must be explicitly defined
    //if there are no default constructors on the superclass.

    public Tubelight(Integer colorNumber, Integer tubeLength, String type, Integer watt) {
        //Need to ensure super is called because first the parent class needs to be initialized
        //if you don't mention this super it will try to call super(), that is the default constructor in parent
        //class which doesn't exist.
        //This is perfect as we are initializing the superclass first and then initializing our
        //instance variables in this class.
        super(type, watt);
        this.colorNumber = colorNumber;
        this.tubeLength = tubeLength;
        System.out.println("This is the tubelight non default constructor");

    }
}
