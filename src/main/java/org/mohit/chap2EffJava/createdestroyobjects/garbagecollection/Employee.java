package org.mohit.chap2EffJava.createdestroyobjects.garbagecollection;

//Garbage collection example from GFG
public class Employee {
    private int empId;
    private String name;
    private int age;
    public static int nextId = 1;


    public Employee(String name, int age) {
        this.empId = nextId++;
        this.name = name;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Creating a method called getNextId that returns the ID of the next employee
    //Keeping static because common for all objects
    public static int getNextId() {
        return nextId;
    }

    @Override
    protected void finalize() {
        --nextId;
    }
}
