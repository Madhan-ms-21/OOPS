package org.self.oops.Concurrency.Sample;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    // Task calculate Factorial of List of Numbers
    public static void main(String[] args) throws InterruptedException {

        List<Long> inputNumbers = Arrays.asList(6L, 3L) ; //, 34L, 355L, 24L, 466L, 23L, 55L);
        List<FactorialThread> threads = new ArrayList<>();
        for(long number:inputNumbers){
            FactorialThread t = new FactorialThread(number);
            //System.out.println(t.getState());
            threads.add(t);
        }

        for(Thread t:threads){
            t.start();
        }

        for(Thread t:threads){
            t.join(2000);
        }

        //--------------------//
        for(int i=0;i<inputNumbers.size();i++){
            FactorialThread t = threads.get(i); //ith Thread Object
            if(t.isFinished()){
                System.out.println(t.getResult());
            }
            else{
                System.out.println("Couldn't complete calc in 2s");
            }
        }
        System.out.println("Main is completed!");
    }
}
