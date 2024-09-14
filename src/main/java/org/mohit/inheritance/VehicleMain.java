package org.mohit.inheritance;

public class VehicleMain {
    public static void main(String[] args) {

        //Here java won't give error because Car is a child of Vehicle
        Vehicle vehicle = new Car();

        //Java obv gives error because it checks Light is not a child of Vehicle
        //But it only checks the type on the RHS whether its compatible or not
        //Vehicle vehicle1 = new Light(true, 5, "");
        //it does not know what type will be assigned to vehicle at runtime
        //for eg see below, there is no way that compiler can know what the type
        //of the vehicle reference will be at runtime.
//        if(someCondition) {
//            vehicle = new Car();
//        }
//        else {
//            vehicle = new Bike();
//        }

        //This won't give any error because you are converting from Parent (Vehicle)
        //to Child (bike). but this will surely fail in runtime because vehicle actually
        //has the type Car, and since there is no relation between Car and Bike,
        //it won't work
        Bike bike;
        bike = (Bike) vehicle;

    }
}
