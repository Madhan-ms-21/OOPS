package org.self.oops.Concurrency3.Mutex;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {

    Count count;
    Lock lock;
    public Adder(Count count , Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i <500; i++){
            lock.lock();
            count.num++;
            lock.unlock();
        }
    }
}
