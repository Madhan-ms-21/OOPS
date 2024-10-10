package org.self.oops.Concurrency.Threads;

public class Main {

    public static void main(String[] args) {
        BasicThread basicThread = new BasicThread();
        Thread thread = new Thread(basicThread);
        Thread thread2 = new Thread(new SecondThread());
        thread.start();
        thread2.start();
        System.out.println("I am in main thread, proof is this " +
                Thread.currentThread().getName());
    }
}
