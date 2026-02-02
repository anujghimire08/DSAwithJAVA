package LinkedList.DoublyLinkedList;


public class InsertionAtSpecifiedPosition {
    static DNode head, tail;
    static int size;


    static void atHead(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    static void atTail(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    static void atSpecifiedPosition(int val, int idx) {
        if (idx < 0 || idx > size) return;
        if (idx == size) {
            atTail(val);
            return;
        } else if (idx == 0) {
            atHead(val);
            return;
        }
        DNode temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        DNode newNode = new DNode(val);

        // Link newNode with next node
        newNode.next = temp.next;
        temp.next.prev = newNode;

        // Link newNode with previous node
        temp.next = newNode;
        newNode.prev = temp;


        size++;
    }

    static void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ⇌ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        atTail(20);
        atTail(30);
        atTail(50);
        atTail(60);
        display();
        atHead(10);
        display();
        atSpecifiedPosition(40, 3);
        display();
    }
}
