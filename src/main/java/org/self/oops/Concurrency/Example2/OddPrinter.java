package org.self.oops.Concurrency.Example2;

public class OddPrinter extends Thread {
    int limit;
    public OddPrinter(int limit) {
        this.limit = limit;
    }
    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
