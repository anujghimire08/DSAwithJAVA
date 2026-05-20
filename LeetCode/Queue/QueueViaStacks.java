package LeetCode.Queue;

public class QueueViaStacks {

// Implement a first in first out (FIFO) queue using only two stacks.
// The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
    /**
     class MyQueue {
     Stack<Integer> st = new Stack<>();
     Stack<Integer> st2 = new Stack<>();

     public MyQueue() {

     }

     public void push(int x) {
     st.push(x);
     }

     public int pop() {
     while (st.size() > 1) {
     st2.push(st.pop());
     }
     int x = st.pop();
     while (!st2.isEmpty()) {
     st.push(st2.pop());
     }
     return x;
     }

     public int peek() {
     while (st.size() > 1) {
     st2.push(st.pop());
     }
     int x = st.peek();
     while (!st2.isEmpty()) {
     st.push(st2.pop());
     }
     return x;
     }

     public boolean empty() {
     return st.size() == 0;

     }
     }
     */
}
