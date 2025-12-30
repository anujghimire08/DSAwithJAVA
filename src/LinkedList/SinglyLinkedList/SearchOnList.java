package LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class SearchOnList {
    static Node head, tail;

    static void atEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    static void find(int val) {
        if (head == null) return;
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.val == val) {
                System.out.println("Found at index: " + idx);
                return;
            }
            idx++;
            temp = temp.next;
        }
    }


    static void display() {
        if (head == null) return;
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.val + " ");
        }
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter You Value you want to search: ");
        atEnd(1);
        atEnd(2);
        atEnd(3);
        atEnd(4);
        atEnd(5);
        atEnd(6);
        atEnd(7);
//        display();
        find(sc.nextInt());
    }
}
