package org.self.oops.AdvConcepts.AnonymousClass;

public interface Test {

    int wheels = 4;

    default void run(){
        System.out.println("Inside Run Method");
    }

    void print();

}
