package org.self.oops.Package2.Static;

public class SampleStaticClass implements SampleStatic{

     final int t = 90;

    @Override
    public void play() {
        System.out.println("Inside Implemented Class");

    }
}


// In Java, you cannot declare a top-level class as static. However, you can declare nested classes as static.