package LinkedList.SinglyLinkedList;

public class DeleteAtTail {
    static Node head, tail;

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void atEndDelete() {
        if(head == null) return;
        else if(head == tail){
            head = tail = null;
        }else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    static void display() {
        if (head == null) {
            System.out.println("Empty LL");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        atTail(10);
        atTail(20);
        atTail(30);
        atTail(40);
        atTail(50);
        display();
        atEndDelete();
        System.out.println();
        display();
    }
}
