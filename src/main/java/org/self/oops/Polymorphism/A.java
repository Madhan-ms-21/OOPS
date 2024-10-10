package org.self.oops.Polymorphism;

//Method Overloading
public class A {

    public int a1 = 5;
    public int a2 = 6 ;

    public void Print() {
        System.out.println("Inside class A ");
    }

    public void Print(String t) {
        System.out.println("Inside Print Method plain: " + t);
    }

    public void Print(int t) {
        System.out.println("Inside calss A Print Method plain: " + t);
    }

}

//Note : From a parent class's variable
//which is holding a child
//object we are allowed to access
//only members which are accessible
//by parent
//
//Depending upon which obj is
//stored in the parent var the
//stored obj's method will be called
//The stored obj has 2 options Either get that method from parent via inheritance or Override