package org.self.oops.Concurrency.Threads;

public class SecondThread extends Thread {

        @Override
        public void run() {
            System.out.println("Inside Thread created using Thread extension");
        }
}
