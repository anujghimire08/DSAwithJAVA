package LinkedList;

public class DeleteAtHead {
    static Node head, tail;

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void deleteHead() {
        if (head == null) {
            System.out.println("empty list");
        }
        head = head.next;
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
        display();
        deleteHead();
        System.out.println("After Deletion");
        display();
    }
}
