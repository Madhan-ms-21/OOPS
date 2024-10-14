package org.self.oops.OOPs.ShallowCopy;

public class Student {
    int id;
    String name;
    Course c1;
    Student(int id, String name, Course c1) {
        this.id = id;
        this.name = name;
        this.c1 = c1;
    }

    public Student(Student s1) {
        this.id = s1.id;
        this.name = s1.name;
        this.c1 = s1.c1;
    }
}
