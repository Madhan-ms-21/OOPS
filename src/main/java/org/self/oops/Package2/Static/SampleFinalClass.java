package org.self.oops.Package2.Static;

public class  SampleFinalClass {

    final int var = 90;
    void print(){
        System.out.println(var);
    }
}

// A class declared as final cannot be subclassed. This means no other class can extend it.
// Useful when you want to prevent inheritance, often for security or design reasons.
// A method declared as final cannot be overridden in any subclass. This ensures that the specific implementation remains unchanged.
//A variable declared as final cannot be reassigned once it has been initialized.
// For reference types, this means the reference cannot change, but the object itself can still be modified.
// Final Interface: Not allowed because it contradicts the purpose of interfaces.
// Inheritance: Interfaces are designed to be extended and implemented.
