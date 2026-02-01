    package LinkedList.SinglyLinkedList;

    public class ssl {
        static Node head, tail;
        static int size;

        static void atHead(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        static void atTail(int val) {
            Node newNode = new Node(val);
            if (head == null) head = tail = newNode;
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        static void addAtIndex(int val, int idx) {
            if (head == null) {
                return;
            } else if (idx == 0) {
                atHead(val);
            } else if (idx == size - 1) {
                atTail(val);
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }

        static void deleteHead() {
            if (head == null) return;
            head = head.next;
            size--;
        }

        static void deleteTail() {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }

        static void deleteAtIndex(int idx) {
            if (head == null || idx < 0 || idx >= size) return;
            if (idx == 0 && size == 1) {
                tail = head = null;
            } else if (idx == 0 && size > 1) {
                deleteHead();
            } else if (idx == size - 1) {
                deleteTail();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if (temp.next == null) tail = temp;
            }
            size--;
        }

        static int get(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.val;
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
            atTail(10);
            atTail(20);
            atTail(30);
            atTail(50);
            atTail(60);
            display();
            addAtIndex(40, 3);
            display();
    //        System.out.println("value of searched index: " + get(4));
        }
    }
