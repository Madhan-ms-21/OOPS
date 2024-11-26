package org.self.oops.AdvConcepts.AnonymousClass;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(){
            void ride() {
                System.out.println("Car is riding in main class");
            }
        };

        Runnable r = new Thread(){
            public void run() {
                car.ride();
            }
        };
        new Thread(r).start();

        Test t = new Test() {
            @Override
            public void print() {
                System.out.println("Printing test using Anonymous Class" );
            }

            @Override
            public void run() {
                System.out.println("Inside run using Anonymous Class");
            }
        };
        t.print();
        t.run();
        System.out.println(Test.wheels);

    }
}
