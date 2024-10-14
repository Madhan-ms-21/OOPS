package org.self.oops.OOPs.DeepCopy;

public class Course {
    int id;
    String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Course(Course course) {
        this.id = course.id;
        this.name = course.name;
    }
}
