package org.self.oops.Package2.Static;

public  interface SampleStatic {

    final int var = 10;

    void play();

    static void playStatic(){
        System.out.println("Static method");
    }

    default void playDefault() {
        System.out.println("Default method2");
    }

}

// 1) we cannot have Private / Protected interface at top level , but in a class we can have
// 2) variables in an interface are static and final (constants)
// 3) Interfaces can have abstract methods , static methods , default methods
// 4) Static and default methods should mandatorily have body
// 5) Final Interfaces also not allowed

