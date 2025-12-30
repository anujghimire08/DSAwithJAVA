package LinkedList.SinglyLinkedList;

public class DeletionAtSpecifiedIndex {
    static Node head, tail;
    static int size;

    static void atEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    static void deleteAtIndex(int idx) {
        if (idx >= size || idx < 0 || head == null) {
            return;
        }
        if (idx == 0) {
            head = head.next;
            if (head == null) tail = null;
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }
        size--;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        atEnd(10);
        atEnd(20);
        atEnd(30);
        atEnd(40);
        atEnd(50);
        display();
        deleteAtIndex(2);
        System.out.println();
        display();
    }
}
