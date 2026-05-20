package LinkedList.SinglyLinkedList;

//class Node { user defined data type
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}
class Linkedlist { // user defined data structure
    Node head;
    Node tail;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }

    void display() {
        if (head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
    }

}
