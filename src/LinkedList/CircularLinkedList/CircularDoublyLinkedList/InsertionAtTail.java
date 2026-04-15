package LinkedList.CircularLinkedList.CircularDoublyLinkedList;

public class InsertionAtTail {
    static Node head, tail;

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode.next = newNode.prev = newNode;
        else {
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    static void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        atTail(10);
        atTail(20);
        atTail(30);
        atTail(40);
        atTail(50);
        display();
    }
}
