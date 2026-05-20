package LinkedList.CircularLinkedList.CircularDoublyLinkedList;

public class DeleteAtHead {
    static Node head, tail;

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode.next = newNode.prev = newNode;
        else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;

        }
    }

    static void deleteHead() {
        if (head == null) return;
        head = head.next;
        head.prev = tail;
        tail.next = head;
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
        atHead(10);
        atHead(20);
        atHead(30);
        atHead(40);
        atHead(50);
        display();
        deleteHead();
        System.out.println();
        display();
    }
}
