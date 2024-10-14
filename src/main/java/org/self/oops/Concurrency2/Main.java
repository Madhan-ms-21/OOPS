package org.self.oops.Concurrency2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(2);
        RandomNumberGenerator generator = new RandomNumberGenerator();
        Future<Integer> obj = es.submit(generator);
        obj.get();
        System.out.println("Random number generated :" + obj.get());
        es.shutdown();

    }
}
