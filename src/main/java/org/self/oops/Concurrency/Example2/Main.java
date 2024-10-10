package org.self.oops.Concurrency.Example2;

public class Main {
    public static void main(String[] args) {

        EvenPrinter evenPrinter = new EvenPrinter(20);
        OddPrinter oddPrinter = new OddPrinter(20);
        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);
        evenThread.run();
        oddThread.start();
    }
}
