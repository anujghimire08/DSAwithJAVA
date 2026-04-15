package LinkedList.DoublyLinkedList;

public class DeletionAtSpecifiedIndex {
    static DNode head, tail;
    static int size;

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

    static void deleteHead() {
        if (head == null) return;
        if (head == tail) {
            size--;
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = null;

        size--;
    }

    static void deleteTail() {
        if (head == null) return;

        if (head == tail) { // only one node
            head = tail = null;
            size--;
            return;
        }

        tail = tail.prev;
        tail.next = null;

        size--;
    }

    static void deleteAtSpecifiedIndex(int idx) {
        if (idx < 0 || idx >= size || head == null) return;
        if (idx == 0) {
            deleteHead();
        } else if (idx == size - 1) {
            deleteTail();
        } else {
            DNode temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }
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
        atTail(10);
        atTail(20);
        atTail(30);
        atTail(40);
        atTail(50);
        display();
        deleteAtSpecifiedIndex(2);
        display();
    }
}
