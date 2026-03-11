package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PeekOperation {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println(q.peek() + " is top el");
        System.out.println(q.poll() + " removed el");
        System.out.println(q);
        q.add(60);
        System.out.println(q);
    }
}