package org.self.oops.Concurrency3.SynchronizationKeyWord;

public class Subtractor implements Runnable {
    final Count count;

    public Subtractor(Count count) {
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < 875; i++) {
            synchronized(count){
                count.num--;
            }

        }
    }
}
