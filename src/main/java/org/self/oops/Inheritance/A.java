package org.self.oops.Inheritance;

public class A {
    String email;
    String password;
    protected A(int a, String b, String c){
        System.out.println("Inside A  Parameterized");
    }
    A(int a){
        System.out.println("Inside A  Constructor "+ a);
    }
    A(){
        System.out.println("Inside A No Arg Constructor");
    }
}
