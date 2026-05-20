package LinkedList.DoublyLinkedList;

class DNode {
    int val;
    DNode next;
    DNode prev;

    DNode(int val) {
        this.val = val;
    }
}

public class basicDLL {
    static void display(DNode head) {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }

    static void displayRev(DNode tail) {
        DNode temp = tail;
        while (temp.next != null) {
            temp = temp.prev;
        }


        System.out.print("null");
        while (temp != null) {
            System.out.print(" ⇌ " + temp.val);
            temp = temp.prev;
        }
        System.out.print(" ⇌ null");
    }


    public static void main(String[] args) {

        DNode a = new DNode(10);
        DNode b = new DNode(20);
        DNode c = new DNode(30);
        DNode d = new DNode(40);
        DNode e = new DNode(50);
        DNode f = new DNode(60);

        // forward links
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // backward links
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
        f.prev = e;

        display(a);
        System.out.println();
        displayRev(f);
    }
}
