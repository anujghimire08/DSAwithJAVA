package Queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 * Demonstrates the behavior of remove() operation on a Queue.
 * remove() throws NoSuchElementException if the queue is empty,
 * so it must be handled using try-catch to maintain normal program flow.
 */
public class RemoveOperation {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        try {
            System.out.println(q.remove());
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty, cannot remove element!");
        }

        q.add("10");
        q.add("20");
        q.add("30");
        q.add("40");
        q.add("50");

        System.out.println("Queue after adding elements: " + q);
    }
}