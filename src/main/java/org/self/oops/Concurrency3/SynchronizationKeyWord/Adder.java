package org.self.oops.Concurrency3.SynchronizationKeyWord;


public class Adder implements Runnable {

    Count count;
    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i <1578; i++){
            synchronized(count){
                count.num++;
            }

        }
    }
}
