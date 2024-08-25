package org.mohit.inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Tubelight tubelight1 = new Tubelight(true, 20, "jersey city");
        Tubelight tubelight2 = new Tubelight(false, 30, "new york city");

        tubelight1.printInfo();
        tubelight2.printInfo();

        Light light = new Tubelight(false, 33, "syracuse");
        //light.printInfo(); //this we can't do because tubelight has this method and not light

        //keeping Light gives you flexibility as it exposes the polymorphism behavior, let's say tomorrow
        //you want to change the new Tubelight to new Bulb, you will have to make one change and rest of the code
        //would still work
        //Also, some function that accepts Light as the type would accept any implementation of Light class.
        //This offers more flexibility and generalizes things

        //This defines IS-A relationship because tubelight IS-A Light
    }
}