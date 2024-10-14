package org.self.oops.OOPs.DeepCopy;

public class Student {
    int id;
    String name;
    Course course;
    Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    Student(Student student) {
        this.id = student.id;
        this.name = student.name;
        this.course = new Course(student.course);
    }
}
