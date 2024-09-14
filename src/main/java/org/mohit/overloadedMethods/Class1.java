package org.mohit.overloadedMethods;

public class Class1 {

    public void flipFlop(String str, Integer i, Integer iRef) {
        System.out.println("This is method1 from Class 1");
    }

    public void flipFlop(Object str, int i, int j) {
        System.out.println("This is method2 from Class 1");
    }
}
