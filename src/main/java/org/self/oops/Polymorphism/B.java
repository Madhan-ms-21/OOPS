package org.self.oops.Polymorphism;

public class B extends A{

    public int b1 = 90;
    public void Print(){
        System.out.println("Inside class B");
    }

    public void Print(int t) {
        super.Print();
        System.out.println("Inside class B Print Method plain: " + t);
    }

}
