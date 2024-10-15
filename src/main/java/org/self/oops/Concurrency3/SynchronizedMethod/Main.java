package org.self.oops.Concurrency3.SynchronizedMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Count count = new Count();
//        ExecutorService es = Executors.newFixedThreadPool(1);
        Adder adder = new Adder(count,lock);
        Subtractor subtractor = new Subtractor(count,lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();

        t1.join();
        t2.join(); //Blocks the calling thread until the specified thread finishes execution. This is useful for synchronization and coordinating thread execution

//        es.shutdown();
        System.out.println("Final Value of count num " + count.num) ;
    }
}
