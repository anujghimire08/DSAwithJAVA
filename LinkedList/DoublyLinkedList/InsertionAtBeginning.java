package LinkedList.DoublyLinkedList;

public class InsertionAtBeginning {
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
        atHead(40);
        atHead(30);
        atHead(20);
        display();
        
        atHead(10);
        display();
    }
}