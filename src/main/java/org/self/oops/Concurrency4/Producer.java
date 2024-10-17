package org.self.oops.Concurrency4;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {


    Queue<Integer> queue;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Producer(Queue<Integer> queue , Semaphore semaphore , Semaphore consumerSemaphore) {
        this.queue = queue;
        this.producerSemaphore = semaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                producerSemaphore.acquire();
                queue.add(1);
                System.out.println("Producer Producing "+i);
                consumerSemaphore.release();
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
