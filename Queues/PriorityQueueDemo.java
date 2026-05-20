package Queues;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
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
// Min-priority queue (default)
// removes smallest first