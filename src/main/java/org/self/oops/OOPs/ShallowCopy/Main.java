package org.self.oops.OOPs.ShallowCopy;

public class Main {
    public static void main(String[] args) {
        Course course =  new Course(1,"Maths");
        Student s1 = new Student(1,"Madhan" , course);
        Student s2 = new Student(s1);

    }
}
