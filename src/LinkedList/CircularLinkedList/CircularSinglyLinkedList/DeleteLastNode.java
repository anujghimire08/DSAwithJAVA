package LinkedList.CircularLinkedList.CircularSinglyLinkedList;

public class DeleteLastNode {
    static Node head, tail;

    static void atEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = tail = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void deletionAtEnd() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
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
        atEnd(10);
        atEnd(20);
        atEnd(30);
        atEnd(40);
        atEnd(50);
        atEnd(60);
        display();
        deletionAtEnd();
        System.out.println();
        display();
    }

}
