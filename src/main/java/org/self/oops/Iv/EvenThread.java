package org.self.oops.Iv;

import org.self.oops.Inheritance.C;

import java.util.concurrent.Semaphore;

public class EvenThread implements Runnable {


    public Count count;
//    public Integer limit;
    public Semaphore evenSemaphore;
    public Semaphore oddSemaphore;
    public  EvenThread(Count count, Semaphore evenSemaphore, Semaphore oddSemaphore) {
        this.count = count;
        this.evenSemaphore = evenSemaphore;
        this.oddSemaphore = oddSemaphore;

    }

    @Override
    public void run() {
        while (count.number < count.limit){
            try {
                evenSemaphore.acquire();
                System.out.println( count.number + " " + Thread.currentThread().getName());
                count.number++;
                oddSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
