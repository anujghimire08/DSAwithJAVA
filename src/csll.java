class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class csll {
    static Node head, tail;
    static int size;

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = newNode;
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    static void atSpecificIndex(int val, int idx) {
        if (head == null || idx < 0 || idx >= size) return;
        if (idx == 0 && size == 1) {
            head = tail = null;
        } else if (idx == 0 && size > 1) {
            atHead(val);

        } else if (idx == size - 1) {
            atTail(val);
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    static void atHeadDelete() {
        if (head == null) return;
        head = head.next;
        tail.next = head;
        size--;
    }

    static void atTailDelete() {
        if (head == null) return;
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = head;
        tail = temp;
        size--;
    }

    static void atSpecifiedIndexDelete(int idx) {
        if (idx < 0 || idx >= size || head == null) return;
        if (idx == 0 && size == 1) {
            head = tail = null;
        } else if (idx == 0 && size > 1) {
            atHeadDelete();
        } else if (idx == size - 1) {
            atTailDelete();
        } else {
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) tail = temp;
        }

    }

    static void display() {
        if (head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }

    public static void main(String[] args) {
        atHead(10);
        atHead(20);
        atHead(40);
        atHead(50);
        display();
        atSpecificIndex(30, 2);
        System.out.println();
        display();
        System.out.println();
        atSpecifiedIndexDelete(3);
        display();
    }

}
