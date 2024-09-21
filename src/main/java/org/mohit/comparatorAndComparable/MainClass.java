package org.mohit.comparatorAndComparable;

import org.mohit.castingAndInstanceOf.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student(1, "mohit");
        Student student2 = new Student(2, "jill");
        Student student3 = new Student(3, "ram");
        Student student4 = new Student(4, "Akshay");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student4);
        studentList.add(student3);
        studentList.add(student1);
        studentList.add(student2);

        Collections.sort(studentList);

        //I think the conditions that are written don't define the ordering properly because id
        //and name rarely are both small or both greater for an object. So ordering doesn't make sense
        //TODO: ASK this
//        for(Student student: studentList) {
//            System.out.println(student);
//        }


        //In the compare method, both the types should be the same
        //This is like a specific comparator that we can use according to the situation
        //we can have several such custom comparators. Objects logic of comparison
        //can be dynamic, at one point you want that only name should be used to order
        //the students, at other point you will use ids of students, etc.
        Comparator<Student> nameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().compareTo(o2.getName()) == 0) {
                    return 0;
                }
                else if(o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        };

        Collections.sort(studentList, nameComparator);

//        for(Student student: studentList) {
//            System.out.println(student);
//        }


        Comparator<Student> nameDescComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getName().compareTo(o2.getName()) == 0) {
                    return 0;
                }
                else if(o1.getName().compareTo(o2.getName()) < 0) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };

        Collections.sort(studentList, nameDescComparator);

        for(Student student: studentList) {
            System.out.println(student);
        }
    }
}
