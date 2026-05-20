package LinkedList.DoublyLinkedList;

public class DeleteLastNode {
    static DNode head, tail;

    static void atHead(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

    }

    static void deleteTail() {
        if (head == null) return;

        if (head == tail) { // only one node
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    static void display() {
        if (head == null) return;
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        atHead(10);
        atHead(20);
        atHead(30);
        atHead(40);
        display();
        deleteTail();
        display();
    }
}
