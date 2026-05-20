package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class EnqueueOnQueueSpecifiedPosition {
    static private void enqueueQueue(Queue<Integer> q, int idx, int val) {
        int n = q.size();
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    static private void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(40);
        q.add(50);
        q.add(60);
        display(q);
        enqueueQueue(q, 2, 30);
        display(q);
    }
}