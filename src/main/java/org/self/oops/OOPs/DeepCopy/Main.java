package org.self.oops.OOPs.DeepCopy;

public class Main {
    public static void main(String[] args) {
        Course c = new Course(1,"Zoology");
        Student S1 = new Student(1,"Madhan",c);
        Student S2 = new Student(S1);
        System.out.println(S2);

    }
}
