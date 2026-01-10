package LinkedList.SinglyLinkedList;
// Create a MENU based program for Singly Linked List

import java.util.Scanner;

public class MenuDrive {
    static Node head, tail;
    static int size;

    static int get(int idx) {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    static void atHead(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    static void atTail(int val) {
        Node newNode = new Node(val);
        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    static void atSpecifiedPosition(int val, int idx) {

        if (idx > size || idx < 0) {
            System.out.println("Index Invalid!!");
        } else if (idx == 0) {
            atHead(val);
        } else if (idx == size) {
            atTail(val);
        } else {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    static void display() {
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
            System.out.println("1) Insertion at Head\n" +
                    "2) Insertion at Tail\n" +
                    "3) Insertion at Specified Position\n" +
                    "4) Access Specified Index Value\n" +
                    "5) Display Linked List\n" +
                    "6) Exit Program");
            System.out.print("Enter Your Operation Choice[1-4}: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Insert Value You want to add: ");
                    atHead(sc.nextInt());
                    break;
                }
                case 2: {
                    System.out.print("Insert Value You want to add: ");
                    atTail(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.print("Insert Value You want to add: ");
                    int val = sc.nextInt();
                    System.out.print("Insert Value index You want add: ");
                    int idx = sc.nextInt();
                    atSpecifiedPosition(val, idx);
                    break;
                }
                case 4: {
                    System.out.print("Insert Index No. whose value you want to access: ");
                    int idx = sc.nextInt();
                    System.out.println("Value of index " + idx + " is:      " + get(idx));
                    break;
                }
                case 5: {
                    display();
                    break;
                }
                case 6: {
                    System.out.println("Closing.....");
                    return;
                }
                default: {
                    System.out.println("Invalid Operation");
                    break;
                }

            }
        } while (choice != 5);
    }
}

