package LinkedList.SinglyLinkedList;

public class InsertionAtSpecifiedPosition {
    static Node head, tail;
    static int size;

    static int get(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    static void atSpecifiedPosition(int val, int idx) {

        if (idx > size || idx < 0) {
            System.out.println("Index Invalid!!");
        } else if (idx == 0) {
            atHead(val);
        } else if (idx == size) {
            atTail(val);
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    static void display() {
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
        atTail(5);
        atTail(6);
        atSpecifiedPosition(4, 2);
        display();
        System.out.println();
        System.out.println("Search value of index: " + get(2));
    }
}
