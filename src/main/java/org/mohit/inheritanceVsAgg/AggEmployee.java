package org.mohit.inheritanceVsAgg;

public class AggEmployee {
    private int empId;
    private String name;

    //Employee HAS-A role.
    private Role role;

    public AggEmployee(int empId, String name, Role role) {
        this.empId = empId;
        this.name = name;
        this.role = role;
    }

    //If roles are changed for an employee
    public void setRole(Role role) {
        this.role = role;
    }

    public void getRole() {
        System.out.println(name + " is "+role.performDuties());
    }
 }
