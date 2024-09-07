package org.mohit.interfaces;

public interface ITestStack extends ISafeStack {
    //Just to check if overriden methods are inherited (they shouldn't be)
    //Checking in Main function


    //Constants
    //Variables are public static and final by default
    //So declaring them is redundant (hence grey coloured)
    //static because it will belong to the interface not to any
    //class or object.
    //Final because different implementing classes cannot have different values
    //of a particular variable, that would break contract. If u want diff
    //values of variables, just define varialbles inside the class itself not in the interface
    public static final String PI_APPROXI = "3.14";
}
