package org.mohit.comparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
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
        for(Student student: studentList) {
            System.out.println(student);
        }


    }
}
