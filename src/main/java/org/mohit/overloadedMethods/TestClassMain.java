package org.mohit.overloadedMethods;



public class TestClassMain {
    public static void main(String[] args) {
        Class1 class1 = new Class1();

        //This is an ambiguous call
        //Because first param is String which can be upcasted to Object too so both methods pass that,
        //2nd param is int for both so unboxing will happen
        //3rd param for method1 it is boxing, for method2 its the same type.
        //class1.flipFlop("something", Integer.valueOf(10), 5);

        // This works and doesn't give error because the compiler first tries
        //to resolve by not performing anything like boxing autoboxing etc.
        //and since method 2 types EXACTLY match the params passed here,
        //the method2 is called
        // class1.flipFlop("something", 5, 10);

        //Also refer Khalid mughal 3rd edition page 326 example 7.11
    }
}
