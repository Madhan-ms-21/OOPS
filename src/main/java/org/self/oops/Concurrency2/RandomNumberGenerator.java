package org.self.oops.Concurrency2;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        System.out.println("Iam in Random number generator");
        int n =  random.nextInt();
        System.out.println("Generated number is " + n);
        return n;
    }
}
