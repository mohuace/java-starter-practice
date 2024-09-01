package org.mohit.constructorChaining;

public class Light {
    private String type;
    private int watt;
    private boolean indicator = false;

    public Light(String type, int watt) {
        //No need to mention super() explicitly as java does this.
        //super();
//        this.watt = watt;
//        this.type = type;
        this(type, watt, true);
        System.out.println("This is Light non default constructor 1");
    }

    public Light(String type, int watt, Boolean indicator) {
        this.watt = watt;
        this.type = type;
        this.indicator = indicator;
        System.out.println("This is the Light non default constructor 2");
    }
}
