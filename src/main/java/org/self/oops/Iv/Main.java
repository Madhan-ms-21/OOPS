package org.self.oops.Iv;

import org.self.oops.Concurrency.Example2.EvenPrinter;

import java.util.concurrent.Semaphore;

public class Main {

    public static int number = 1;
    public static int limit = 100;

    public static void main(String[] args) {

        Count count = new Count(25);

        Integer number = 1;
        Integer limit = 25;

        Semaphore even = new Semaphore(0);
        Semaphore odd = new Semaphore(1);

        Thread evenPrinter = new Thread(new EvenThread(count,even,odd));
        evenPrinter.setName("EvenPrinter");
        Thread oddPrinter = new Thread(new OddThread(count,even,odd));
        oddPrinter.setName("OddPrinter");

        oddPrinter.start();
        evenPrinter.start();


    }

    public static class PrintThread implements Runnable {

        public boolean oddThread;

        public PrintThread(boolean oddThread) {
            this.oddThread = oddThread;
        }

        @Override
        public void run() {
            synchronized (Main.class) {
                while (number <= limit) {
                    if ((oddThread && number % 2 != 0) || (!oddThread && number % 2 == 0)) {
                        System.out.println(number + " "+ Thread.currentThread().getName());
                        number++;
                        Main.class.notify();
                    }
                    else{
                        try {
                            Main.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
