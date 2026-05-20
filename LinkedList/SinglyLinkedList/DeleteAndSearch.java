package LinkedList.SinglyLinkedList;

public class DeleteAndSearch {
    static Node head, tail;

    static void DeleteT() {
        if (head == null) return;
        else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    static int search(int val) {
        if (head == null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    static void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        atHead(10);
        atHead(20);
        atHead(30);
        atHead(40);
        atHead(50);
        display();
        int value = search(30);
        System.out.println();
        System.out.println((value == -1) ? "Not Found" : "at " + value + " idx found");
        DeleteT();
        display();

    }
}
