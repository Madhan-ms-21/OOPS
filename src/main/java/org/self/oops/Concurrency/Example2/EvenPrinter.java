package org.self.oops.Concurrency.Example2;

public class EvenPrinter extends Thread {

    int limit;
    public EvenPrinter(int limit) {
        this.limit = limit;
    }
    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }
}
