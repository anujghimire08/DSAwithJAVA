package Heaps;

import java.util.*;

public class MaxHeap {
    public static void main(String[] args) {
//        Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(30); // tc = O(n log n) for n items
        System.out.println(pq);
        System.out.println(pq.remove()); // tc = O(log n)
        System.out.println(pq);
        System.out.println(pq.peek()); // tc = O(1)
    }
}
