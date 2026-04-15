package Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LinkedListStack {
    static Node head;
    static int size;

    static void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    static int peek() {
        if (head == null) {
            throw new IllegalStateException("Stack Underflow");
        }
        return head.val;
    }

    static int pop() {
        if (head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }

    static int stackSize() {
        return size;
    }

    static boolean isEmpty() {
        return head == null;
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        System.out.println(pop());
        System.out.println(isEmpty());
        push(10);
        push(20);
        push(30);
        push(40);
        display();
        System.out.println(pop() + " popped");
        display();
        push(40);
        display();
        System.out.println(stackSize() + " stack size");
        System.out.println();
        System.out.println(isEmpty());
        System.out.println(peek());
    }
}
