package org.self.oops.Concurrency4.Sempahore;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore producer = new Semaphore(4);
        Semaphore consumer = new Semaphore(0);
        Queue<Integer> queue = new LinkedList<>();
        Producer producer1 = new Producer(queue,producer,consumer);
        Consumer consumer1 = new Consumer(queue,producer,consumer);
        Thread t1 = new Thread(producer1);
        Thread t2 = new Thread(consumer1);

        t1.start();
        t2.start();

//        t1.join();
//        t2.join();
        Integer a = 8;
        


    }
}
