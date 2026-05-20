package LinkedList.SinglyLinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class BasicNodeList {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        // n1->n2->n3->n4->n5
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(n1.next.next.next.val);
    }
}
