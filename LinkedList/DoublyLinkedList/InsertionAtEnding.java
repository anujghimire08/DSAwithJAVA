package LinkedList.DoublyLinkedList;

public class InsertionAtEnding {
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
        atTail(40);
        display();
    }
}
