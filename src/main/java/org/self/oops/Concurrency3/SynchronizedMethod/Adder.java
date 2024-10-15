package org.self.oops.Concurrency3.SynchronizedMethod;


import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {

    Count count;
    Lock lock;
    public Adder(Count count , Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i <8400; i++){
            count.increment();
        }
    }
}
