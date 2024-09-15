package org.mohit.castingAndInstanceOf;

public class Casting {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();

        System.out.println(bike instanceof Vehicle);

        //Object <------ Vehicle <------ Bike

        Vehicle vehicle1 = new Car();
        System.out.println(vehicle1 instanceof Car);
    }
}
