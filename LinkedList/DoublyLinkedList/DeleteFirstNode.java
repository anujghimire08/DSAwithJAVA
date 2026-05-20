package LinkedList.DoublyLinkedList;

public class DeleteFirstNode {
    static DNode head, tail;

    static void atTail(int val) {
        DNode newNode = new DNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }


    static void deleteHead() {
        if (head == null) return;
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
//        head.prev.next = null;
        head.prev = null;
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
        display();
        deleteHead();
        display();
    }
}
