package Queues;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Demonstrates the behavior of poll() operation on a Queue.
 * poll() retrieves and removes the head of the queue.
 * If the queue is empty, poll() returns null instead of throwing an exception.
 */
public class PollOperation {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();

        // Attempt to poll element from empty queue
        System.out.println(q.poll());
    }
}