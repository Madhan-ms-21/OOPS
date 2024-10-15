package org.self.oops.Concurrency3.SynchronizationKeyWord;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join(); //Blocks the calling thread until the specified thread finishes execution. This is useful for synchronization and coordinating thread execution

//
        System.out.println("Final Value of count num " + count.num) ;
    }
}
