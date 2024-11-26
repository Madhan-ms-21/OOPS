package org.self.oops.Collections.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImpl {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.offer("World");
        queue.offer("Iam");
        queue.offer("queue");


        for (int i = 0 ; i< 4;i++) {
            queue.add("Inside");
//            System.out.println(s);
        }
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // max Heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);
        priorityQueue.add(11);
        priorityQueue.add(22);
        priorityQueue.add(31);
        priorityQueue.add(4);
        priorityQueue.add(15);
        priorityQueue.add(26);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }


    }
}
