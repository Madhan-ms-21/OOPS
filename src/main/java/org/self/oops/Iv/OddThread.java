package org.self.oops.Iv;

import java.util.concurrent.Semaphore;

public class OddThread implements Runnable{

    public Count count;

    public Semaphore evenSemaphore;
    public Semaphore oddSemaphore;
    public OddThread(Count count ,Semaphore evenSemaphore, Semaphore oddSemaphore) {
        this.count = count;

        this.evenSemaphore = evenSemaphore;
        this.oddSemaphore = oddSemaphore;
    }
    @Override
    public void run() {
        while (count.number < count.limit){
            try {
                oddSemaphore.acquire();
                System.out.println( count.number + " " + Thread.currentThread().getName());
                count.number++;
                evenSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
