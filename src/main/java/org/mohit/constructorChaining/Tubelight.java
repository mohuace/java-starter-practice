package org.mohit.constructorChaining;

public class Tubelight extends Light {

    String type = "abc";
    int watt = 44;

    //This is not working because when a subclass's constructor is called
    //The first thing that should happen is that the superclass should be invoked and initialized
    //So, here, type and watt are not initialized because the superclass is not yet called
//    public Tubelight() {
//            this(type, watt);
//    }

    public Tubelight(String type, int watt) {
        super(type, watt);
    }
}
