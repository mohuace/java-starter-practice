package org.mohit.hashAndEquals;

import java.util.HashMap;
import java.util.Map;

public class hashMain {
    public static void main(String[] args) {

        //A List of List or List of LinkedList is used behind the scenes of a hashMap.
        Map<Employee, Integer> mp = new HashMap();

        Employee em1 = new Employee(1, "mohit", "IT", 100000);
        Employee em2 = new Employee(2, "jack", "Finance", 300000);
        Employee em3 = new Employee(3, "mike", "Security", 200000);
        Employee em4 = new Employee(4, "daniel", "secret agent", 1000000);
        Employee em5 = new Employee(5, "rachel", "Finance", 450000);
        Employee em6 = new Employee(1, "mohit", "IT", 100000);

        mp.put(em1, em1.getEmpId());
        mp.put(em2, em2.getEmpId());
        mp.put(em3, em3.getEmpId());
        mp.put(em4, em4.getEmpId());
        mp.put(em5, em5.getEmpId());
        mp.put(em6, em6.getEmpId());

        for (Employee employee : mp.keySet()) {
            System.out.println(employee + ":" + employee.getEmpId());
        }
    }
}
