package LinkedList.CircularLinkedList.CircularSinglyLinkedList;

//Java Program to create a Circular Singly Linked list
public class InsertionAtEnding {
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

    static void display() {
        if(head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.printf("(%d i.e head)", temp.val);
    }

    public static void main(String[] args) {
        atEnd(10);
        atEnd(20);
        atEnd(30);
        atEnd(40);
        atEnd(50);
        display();
    }
}
