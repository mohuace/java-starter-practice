package org.mohit.inheritance;

public class Tubelight extends Light {
    public Tubelight(boolean indicator, int numberOfWatts, String location) {
        super(indicator, numberOfWatts, location);
    }
    //Cannot access isOn directly because it is private

    private int tubeLength = 55;
    private int colorNo = 10;

    public int getTubeLength() {
        return tubeLength;
    }

    public void printInfo() {
        System.out.println("Color no "+colorNo);
        System.out.println("Wattage: "+numberOfWatts); // Inherited
        //System.out.println("Indicator"+incdicator); //Not inherited
        System.out.println("Location: "+location);
        //System.out.println("Counter"+counter); //Not inherited
        //System.out.println(printLocation()); //Not inherited
        writeCount();
    }



}
