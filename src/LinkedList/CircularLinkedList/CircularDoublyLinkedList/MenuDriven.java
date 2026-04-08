package LinkedList.CircularLinkedList.CircularDoublyLinkedList;

import java.util.Scanner;


public class MenuDriven {
    static Node head, tail;

    static void atHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.next = head;
            newNode.prev = tail;

            tail.next = newNode;
            head.prev = newNode;

            head = newNode;
        }

    }

    static void deleteTail() {
        if (head == null) return;


        if (head == tail) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

        System.out.println("Deleted from tail!");
    }

    static void display() {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1) Insert at Head");
            System.out.println("2) Delete at Tail");
            System.out.println("3) Display");
            System.out.println("4) Exit");

            System.out.print("Enter Operation Choice[1-4]: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Value to add: ");
                    atHead(sc.nextInt());
                    break;

                case 2:
                    deleteTail();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Closing...");
                    break;
            }

        } while (choice != 4);

    }
}
