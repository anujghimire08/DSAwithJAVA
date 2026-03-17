package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DequeueOnSpecificIndex {
    static void DequeueAtIndex(Queue<Integer> q, int idx) {
        if (idx < 0 || idx > q.size() - 1) return;
        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.poll());
        }
        q.poll();
        for (int i = 0; i < n - idx - 1; i++) {
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(10);
        q.add(20);
        q.add(25);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        DequeueAtIndex(q, 2);
        System.out.println(q);
    }
}
