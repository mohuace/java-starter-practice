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
    }
}
