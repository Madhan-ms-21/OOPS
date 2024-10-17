package org.self.oops.Concurrency4;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    Queue<Integer> queue;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;
    public Consumer(Queue<Integer> queue , Semaphore semaphore , Semaphore consumerSemaphore) {
        this.queue = queue;
        this.producerSemaphore = semaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                consumerSemaphore.acquire();
                queue.remove();
                System.out.println("Consumer Consuming "+ i);
                producerSemaphore.release();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
