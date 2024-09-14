package org.mohit.interfaces;

import org.mohit.hashAndEquals.Employee;

public class StackInterfaceMain {
    public static void main(String[] args) {
        StackImpl stackImp1 = new StackImpl();
        StackImpl stackImp2 = new StackImpl();

        stackImp1.push(new Employee(1, "mohit", "abc", 2000));
        stackImp1.push(new Employee(2, "jack", "def", 3000));

        stackImp2.push(new Employee(3, "pam", "ref", 5000));

        //Should return Jack's details. Also, because we have put toString() method in Employee class,
        //it will print just fine.
        System.out.println(stackImp1.pop());

        stackImp1.push(new Employee(2, "jack's replacement", "bbc", 2500));

        System.out.println(stackImp1.stackArr);


        //Should return pam
        //System.out.println(stackImp2.pop());

        //Should return mohit
        //System.out.println(stackImp1.pop());

        ISafeStack safeStackref = new SafeStackImpl();
        safeStackref.push(new Employee(1, "mohit", "abc", 2000));
        safeStackref.push(new Employee(2, "jack", "def", 3000));

        safeStackref.push(new Employee(3, "pam", "ref", 5000));

        System.out.println(safeStackref.isEmpty());
        System.out.println(safeStackref.isFull());

        safeStackref.doingSomething();

        ITestStack testStack = new TestStackImpl();
        testStack.doingSomething();


        //polymorphism behaviour
        SafeStackImpl safeStackImpl = new SafeStackImpl();
        //ISafeStack is parent of SafeStackImpl --> so you can give reference to parent easily
        //Because SafeStackImpl IS-A ISafeStack
        ISafeStack iSafeStackRef = safeStackImpl;

        //Can't do the other way round
        //This is because iSafeStack IS NOT A SafeStackImpl
//        ISafeStack iSafeStack = new SafeStackImpl();
//        SafeStackImpl safeStackRef = iSafeStack;

        //You can give safeStackImpl to IStack also
        IStack iStackRef = safeStackImpl;
        //But here, you won't have access to isEmpty or isFull
        //Because in the interface of IStack, those methods do not exist so not in the contract

        //You can create Array types of Interface
        //for eg,
        //This is legal
        //But when you add elements in here, you will most probably
        //need to put objects of classes that implement this interface
        ISafeStack[] iSafeStacks = new ISafeStack[10];

        //Example
        //This is valid because SafeStackImpl[] is child of StackImpl[],
        //Note: SafeStackImpl is assigned at runtime, not at compile time,
        //Compiler only knows the LHS part, that is stackImpls array is of type
        //StackImpl[].
        StackImpl[] stackImpls = new SafeStackImpl[5];
        //This is also valid because inside the array the objects should be of type StackImpl, which is true
        //as SafeStackImpl is of type StackImpl
        stackImpls[0] = new SafeStackImpl();
        //The bottom line may seem to be fine. But there is a problem.
        //We have defined our stackImpls as object of type SafeStackImpl[]
        //And now inside that array u are putting elements of type StackImpl which is not possible
        //because even though SafeStackImpl IS A StackImpl but StackImpl IS NOT A SafeStackImpl.
        //So object of StackImpl cannot be assigned to SafeStackImpl (parent IS NOT A child)
        //But this will give error in runtime not compile time because what object is getting used
        //is not decided.
        //stackImpls[1] = new StackImpl(); //Throws array store exception


        //Understanding reference conversions
        Object objRef;
        StackImpl stackImplRef;
        SafeStackImpl safeStackRef;
        IStack iStackRef1;
        ISafeStack iSafeStackRef1;

        safeStackRef = new SafeStackImpl(); //obv possible as same type
        objRef = safeStackRef; //possible because safeStackRef IS-A Object
        stackImplRef = safeStackRef; // possible because stackImplRef is parent

        //for arrays
        Object[] objArr = new Object[3]; //Always possible
        int[] intArray = new int[10];
        objRef = intArray; //possible because Object is at the top
        //objArr = intArray; doesnt work because array of primitive types directly have Object as parent and not Object[]






    }
}
