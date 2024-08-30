package org.mohit.hashAndEquals;

import java.util.Objects;

public class Employee {
    public int empId;
    public String name;
    public String department;
    public int salary;

    public Employee(int empId, String name, String department, int salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    //We will generate equals method where empId, name is enough.
    //Equals method is used to compare equality between two different objects.
    //For eg, when storing in hashMap, there will be hashCode generated based on where to
    //store the object in the bucket, once bucket is decided, the equals method will check
    //where exactly inside the bucket should the object be stored.
    @Override
    public boolean equals(Object o) {
        //If i always return true, that means every object is equal to every other object
        //that means only 1 value will be stored in the hashMap, rest all will be treated
        //as the object and would not be stored. However, remember this will only happen
        //when two objects are stored in the same bucket. But if hashCode is generating
        //different hashCodes for those objects, they will stored in different buckets so
        //returning true won't matter because every object will be in their own separate
        //bucket.
        //return true;

        //This would mean if two objects are logically same, they will still be considered different
        //and stored as a separate element in the list of that bucket.
        //note that if two objects are same, their hashCode (if implemented correctly), will be the same so
        //they will be in the same bucket.
        //return false;

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Objects.equals(name, employee.name);
    }

    //Hashcode generates a unique id that will be stored inside a bucket of an array,
    //two different objects can have the same hashCode
    @Override
    public int hashCode() {
        //If i return a constant value, that means every object will be stored in the same bucket.
        //This leads to performance issue, because when we try to lookup in a hashMap for a particular
        //Employee obj (which is the key of a hashMap), it is no longer a O(1) operation because after
        //getting into the bucket, all the elements of the hashMap are present in a list and then
        //the equals method will be used to check which is our object that we are looking for and accordingly,
        //that object is fetched. This will become an O(n) operation essentially. However, as long as the
        //equals method is implemented correctly, the correctness of the code is not compromised but the performance
        //is.
        //return 2;
        return Objects.hash(empId, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
