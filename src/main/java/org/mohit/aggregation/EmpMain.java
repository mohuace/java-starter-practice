package org.mohit.aggregation;

public class EmpMain {
    public static void main(String[] args) {
        //Aggregation is a weak link -- it establishes HAS-A relationship
        //that is Department HAS-A Employee (here we have more than one employees).
        //But if department doesn't exist, that doesn't mean that employees also wouldn't exist.
        Employee emp1 = new Employee(1, "mohit", "abc");
        Employee emp2 = new Employee(2, "rohit", "def");

        Department dept = new Department();
        dept.emps.add(emp1);
        dept.emps.add(emp2);

        //Let's say i make dept as null
        dept = null;

        //Still employee exists separately
        System.out.println(emp1.getEmpId());
    }
}
