package LinkedList.CircularLinkedList.CircularSinglyLinkedList;

public class DeleteFirstNode {
    static Node head, tail;

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }

    }

    static void deletionAtHead() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        tail.next = head;
    }

    static void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.val + "  ");
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
        deletionAtHead();
        System.out.println();
        display();
    }
}
