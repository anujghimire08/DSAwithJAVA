package LinkedList.SinglyLinkedList;

public class DeleteAtHead {
    static Node head, tail;
    static int llSize;

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        llSize++;
    }

    static void deleteHead() {
        if (head == null) {
            System.out.println("empty list");
            return;
        }
        head = head.next;
        if (head == null) tail = null; // for when list has only one node
        llSize--;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        atTail(0);
        atTail(1);
        atTail(2);
        atTail(3);
        System.out.println("Before Deletion");
        System.out.println("Linked List Size: " + llSize);
        display();
        deleteHead();
        System.out.println("After Deletion");
        display();
        System.out.println("Linked List Size: " + llSize);
    }
}
