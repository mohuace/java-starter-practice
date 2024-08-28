package org.mohit.composition;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("worldClassEngine", "Engine1", 35000);
        Car car2 = new Car("mediocreEngine", "Engine2", 20000);

        System.out.println(car1.getEngineType());

        //Removing the car1 object
        //Engine also ceases to exist
        car1 = null;
    }
}
