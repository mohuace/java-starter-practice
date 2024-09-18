package org.mohit.comparatorAndComparable;

import java.util.Objects;

public class Student implements Comparable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    //Equals performs two operations --> first uses hashCode to find where the
    //object is located, and then uses equals to check if curr object same as the one that is passed
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


//    Default comparable
//    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
