package LinkedList;

public class InsertionAtBeginning {
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

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    static void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        atTail(1);
        atTail(2);
        atTail(3);
        atTail(4);
        atTail(5);
        atHead(0);
        atHead(-1);
        display();
    }
}
