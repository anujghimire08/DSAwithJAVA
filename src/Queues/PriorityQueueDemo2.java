package Queues;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(0);
        pq.add(14);
        pq.add(4);
        pq.add(8);
        System.out.println(pq);
        System.out.println("Priority Queue elements:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
// Max-priority queue
// removes largest first