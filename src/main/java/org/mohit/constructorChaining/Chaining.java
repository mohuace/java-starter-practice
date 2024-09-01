package org.mohit.constructorChaining;

public class Chaining {
    public static void main(String[] args) {
        // If non default constructor is provided, default constructor
        //ceases to exist that is why can't execute the below statement
        // Light light = new Light();

        Tubelight tubelight = new Tubelight();
    }
}
