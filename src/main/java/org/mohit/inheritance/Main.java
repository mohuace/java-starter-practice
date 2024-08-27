package org.mohit.inheritance;

public class Main {
    public static void main(String[] args) {
//
        Tubelight tubelight1 = new Tubelight(true, 20, "jersey city");
//        Tubelight tubelight2 = new Tubelight(false, 30, "new york city");
//
//        tubelight1.printInfo();
//        tubelight2.printInfo();
//
        Light light = new Tubelight(false, 33, "syracuse");
        Light light1 = new Light(false, 35, "colorado");
        //light.printInfo(); //this we can't do because tubelight has this method and not light

        //keeping Light gives you flexibility as it exposes the polymorphism behavior, let's say tomorrow
        //you want to change the new Tubelight to new Bulb, you will have to make one change and rest of the code
        //would still work
        //Also, some function that accepts Light as the type would accept any implementation of Light class.
        //This offers more flexibility and generalizes things

        //This defines IS-A relationship because tubelight IS-A Light

        //tubelight1.trial();
//        System.out.println(light1.isSmart);
//        System.out.println(tubelight1.isSmart);

        Tubelight tube1 = new Tubelight(true, 44, "abc");
        System.out.println(tube1.billType);

        //Field access is Static --> meaning while accessing fields, the reference type in this case Light is
        //used to access the instance variable. This is defined at compile time. Hence, Small is printed
        //Instance variables are not overriden in Java.

        Light tube2 = new Tubelight(true, 44, "abc");
        System.out.println(tube2.billType);
        //This prints Large because which method to use is determined at runtime.
        System.out.println(tube2.getBillType());

        Light lt1 = new Light(true, 44, "abc");
        System.out.println(lt1.billType);

        //When you do Child c = new Child(), the Child class field is hiding the super class's field.
        //It is not overriding it. The child field is separate to parent field, there is no relation.
        //Similarly, if you are doing Parent p = new Child(), and then doing p.name or whatever,
        //you are essentially calling the field of the parent class.
        //If you keep field access dynamic, it will cause confusion. Let's say p.name would call
        //the child class's field, this is not good because here you know that at runtime that p
        //would contain the object of child class, but in other cases you might not know what type
        //of object would p be. In that case, if u access the field using p.name, you have no way
        //of knowing (at compile time), that which field from all the children you are actually
        //accessing.
        //This is good with methods that are supposed to be dynamic and they define the behaviour of
        //objects at runtime, but the variables do not define behaviour, they rather define the state
        //of the object. So, there should be a consistent way of accessing it.
        //TODO: ASK - but when you use getters and setters, you are essentially relying on what the state of
        //the object would be at runtime, and accordingly that field will be accessed?????

        Light tube3 = new Tubelight(false, 44, "sfo");
        //we won't be able to access tube3.check even though it is public in child
        //it only checks the check inside Light class because it checks the reference type

    }
}