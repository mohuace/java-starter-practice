package org.mohit.chap2EffJava.createdestroyobjects.garbagecollection;

public class MainClass {
    public static void main(String[] args) {
        Employee emp1 = new Employee("sam", 22);
        Employee emp2 = new Employee("tom", 24);
        Employee emp3 = new Employee("jackson", 32);

        {
            //Let's say these two employees were interns and they no longer exist outside of
            //this block of code. They should no longer exist in the system
            Employee emp4 = new Employee("daniel", 19);
            Employee emp5 = new Employee("rachel", 20);

            //Need to provide this
            emp4 = emp5 = null;
            //This will call the garbage collector to remove the objects from the heap memory
            System.gc();
            //Will call finalize method as well
            System.runFinalization();



        }

        //If you don't provide anything, the next id that would be returned will be 6
        //But since emp4 and emp5 do not exist now, they should be returning 4
        System.out.println(Employee.getNextId());


    }
}
