package Queues;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class QueueViaLinkedList {
    Node head, tail;
    int size;

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
        size--;
        return front;
    }

    int peek() {
        if (head == null) return -1;
        return head.val;
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
        qll.add(10);
        qll.add(20);
        qll.add(30);
        qll.add(40);
        qll.add(50);
        qll.display();
        qll.poll();
        qll.display();
        System.out.println("top value: " + qll.peek());
        System.out.println("size of queue: " + qll.size);
    }
}
