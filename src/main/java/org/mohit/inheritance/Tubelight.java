package org.mohit.inheritance;

public class Tubelight extends Light {

    //Cannot access isOn directly because it is private

    private int tubeLength = 55;
    private int colorNo = 10;

    public String check = "inside tubelight";

    //Same instance variable as declared in Light
    public String billType = "Large";

    public Tubelight(boolean indicator, int numberOfWatts, String location) {
        super(indicator, numberOfWatts, location);
        isSmart = true;
    }

    @Override
    public String getBillType() {
        return billType;
    }

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


    //Overriden method has to widen the accessibility or keep it the same.
    //If superclass is private, we won't be able to override it in the first place.
    //If superclass is protected, we can make subclass public
    //If superclass is public, we cannot make it private or protected because leads to confusion
    //because in the superclass we are saying the method would be public and suddenly in runtime(that is when
    //it is decided which method is going to be implemented), you say that the method is not accessible, this
    //does not fit the OOP principles.
    @Override
    public void trial() {
        System.out.println("This is a tubelight method which is overriding the Light method");
    }

    //Overriden method can have a return type which is a subclass of the return type of the parent.
    //This is called covariant return
    @Override
    public Tubelight makeInstance(boolean indicator, int numberOfWatts, String location) {
        return new Tubelight(indicator, numberOfWatts, location);
    }



}
