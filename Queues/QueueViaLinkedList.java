package Queues;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class QueueViaLinkedList {
    private Node head, tail;
    private int size;

    void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    int poll() {
        if (head == null) return -1;
        int front = head.val;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return front;
    }

    int peek() {
        if (head == null) return -1;
        return head.val;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return false;
    }

    int size() {
        return size;
    }


    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueViaLinkedList qll = new QueueViaLinkedList();
        System.out.println("isEmpty:" + qll.isEmpty());
        qll.add(10);
        qll.add(20);
        qll.add(30);
        qll.add(40);
        qll.add(50);
        qll.display();
        qll.poll();
        qll.display();
        System.out.println("top value: " + qll.peek());
        System.out.println("size of queue: " + qll.size());
        System.out.println("isEmpty:" + qll.isEmpty());
        System.out.println("isFull: " + qll.isFull());
    }
}
