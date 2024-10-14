package org.self.oops.Concurrency2.SynchronizationProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Count count = new Count();
        ExecutorService es = Executors.newFixedThreadPool(1);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        es.execute(adder);
        es.execute(subtractor);

        es.shutdown();
        System.out.println("Final Value of count num " + count.num) ;
    }
}
