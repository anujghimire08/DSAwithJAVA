package LinkedList.CircularLinkedList;
//Java Program to insert a node at the beginning of a Circular Singly Linked list
public class InsertionAtBeginning {
    static Node head, tail;

    static void atBeg(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            head = newNode;
        }

    }

    static void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.printf("(%d i.e head)", temp.val);
    }

    public static void main(String[] args) {
        atBeg(10);
        atBeg(20);
        atBeg(30);
        atBeg(40);
        atBeg(50);
        display();
    }

}
