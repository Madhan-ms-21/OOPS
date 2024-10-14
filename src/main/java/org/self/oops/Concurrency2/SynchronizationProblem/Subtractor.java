package org.self.oops.Concurrency2.SynchronizationProblem;

import java.util.concurrent.Callable;

public class Subtractor implements Runnable {
    Count count;

    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count.num--;
        }
    }
}
