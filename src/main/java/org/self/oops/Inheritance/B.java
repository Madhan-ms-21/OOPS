package org.self.oops.Inheritance;

public class B extends A{
    int rollNo;
    String name;
    int age;
//    B(){
////        super(2,"m","c"); // when we want to call specific constructor use super Key word
//        System.out.println("Inside B");
//    }
    B(int rollNo, String name, int age){
        super(2,"m","c");
    }
    B(int rollNo, String name){

    }
}
