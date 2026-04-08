package LinkedList.DoublyLinkedList;

import java.util.Scanner;

// Create a MENU based program for Double Linked List

class Node {
    int val;
    Node next, prev;

    Node(int val) {
        this.val = val;
    }

}

public class MenuDrive {
    static Node head, tail;

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
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
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1) Insert at Head\n" + "2) Delete at Tail\n" + "3) Display\n" + "4) Exit\n");
            System.out.print("Enter Operation Choice[1-4]: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Insert Value You want to add: ");
                    atHead(sc.nextInt());
                    break;
                }
                case 2: {
                    deleteTail();
                    break;
                }
                case 3: {
                    display();
                    break;
                }
                case 4: {
                    System.out.print("Closing....");
                    break;
                }

            }
        } while (choice != 4);
    }
}