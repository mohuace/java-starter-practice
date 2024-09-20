package org.mohit.comparatorAndComparable;

import java.util.Objects;

public class Student implements Comparable<Student> {
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

    //Default comparable --- used for sorting
    //This is defined inside the class itself so this logic is the natural ordering
    //for the objects
    @Override
    public int compareTo(Student o) {
        //When two objects are equal
        if (this.id == o.id && this.name.equals(o.name)) {
            return 0;
        }
        //When this id as well as name is less, returning -1 means this object will be ordered before the o object
        else if(this.id < o.id && this.name.compareTo(o.name) < 0) {
            return -1;
        }
        //If none satisfy, then "this" should come after the o object.
        //And here since we havent written conditions like id for object1 is greater than id for object2 but object1's
        //name is smaller, then it wont pass previous two conditions, it will just put the current obj (this) after the
        //second object
        else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
