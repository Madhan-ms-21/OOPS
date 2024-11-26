package org.self.oops.Concurrency2.SynchronizationProblem;

import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Count count = new Count();
        ExecutorService es = Executors.newFixedThreadPool(1);
        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        StringBuilder s = new StringBuilder("test");
//        s.append("te");
        StringBuffer sb = new StringBuffer("test");
        es.execute(adder);
        HashMap<Integer, String> map = new HashMap<>();
        es.execute(subtractor);
        String immutable = "abc";
        immutable = immutable + "def";
        System.out.println(immutable + " "+s);
        es.shutdown();
        System.out.println("Final Value of count num " + count.num);
    }
}
