package org.self.oops.Concurrency3.SynchronizedMethod;

public class Count {
    public int num;
    public Count() {
        this.num = 0;
    }
    public synchronized void increment() {
        this.num++;
    }
    public synchronized void decrement() {
        this.num--;
    }
}
