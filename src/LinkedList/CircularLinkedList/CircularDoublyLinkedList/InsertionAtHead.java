package LinkedList.CircularLinkedList.CircularDoublyLinkedList;

class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }

}

public class InsertionAtHead {
    static Node head, tail;

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode.next = newNode.prev = newNode;
        } else {
            newNode.next = head;     // new node points forward to old head
            newNode.prev = tail;     // new node points back to tail
            head.prev = newNode;     // old head points back to new node
            tail.next = newNode;     // tail points forward to new node
            head = newNode;          // update head
        }
    }

    static void display() {
        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        atHead(30);
        atHead(20);
        atHead(10);
        display();
    }
}
