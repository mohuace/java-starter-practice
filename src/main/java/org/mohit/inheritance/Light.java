package org.mohit.inheritance;

public class Light {

    //Subclasses or any other classes won't be able to access this
    private boolean indicator;
    public int numberOfWatts;

    //Only accessible from within the package
    protected String location;

    private static int counter; //for number of light objects that are created

    public Light(boolean indicator, int numberOfWatts, String location) {
        this.indicator = indicator;
        this.numberOfWatts = numberOfWatts;
        this.location = location;
        counter++;
    }

    public int getNumberOfWatts() {
        return numberOfWatts;
    }

    public void setNumberOfWatts(int numberOfWatts) {
        this.numberOfWatts = numberOfWatts;
    }

    public void switchOn() {
        indicator = true;
    }

    public void switchOff() {
        indicator = false;
    }

    //This is private so subclasses won't be able to access it
    private void printLocation() {
        System.out.println("The location is"+location);
    }

    public void writeCount() {
        System.out.println("Number of lights currently are"+counter);
    }
}
