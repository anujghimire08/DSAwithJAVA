package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        int n = q.size();
        for(int i = 0 ; i<n;i++){
            System.out.println(q.peek());
            q.add(q.remove());
        }
    }
}
