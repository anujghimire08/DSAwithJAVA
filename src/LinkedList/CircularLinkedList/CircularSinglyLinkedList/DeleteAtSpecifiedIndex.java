package LinkedList.CircularLinkedList.CircularSinglyLinkedList;

public class DeleteAtSpecifiedIndex {
    static Node head, tail;
    static int size;

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
        size++;
    }

    static void positionDelete(int idx) {
        if (head == null || idx < 0 || idx >= size) return;
        if (idx == 0 && size == 1) {
            head = tail = null;
        } else if (idx == 0 && size > 1) {
            head = head.next;
            tail.next = head;

        } else if (idx == size - 1) {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
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
        atEnd(100);atEnd(200);atEnd(300);atEnd(400);atEnd(500);
        display();
        positionDelete(2);
        System.out.println();
        display();
    }
}
