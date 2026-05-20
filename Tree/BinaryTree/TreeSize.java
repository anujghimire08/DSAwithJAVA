package Tree.BinaryTree;

public class TreeSize {
    public static void main(String[] args) {
//            1
//          /   \
//         2     3
//        /  \  /  \
//       4   5  6   7
        Node a = new Node(1); // root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        b.left = d;
        b.right = e;
        a.right = c;
        c.left = f;
        c.right = g;
        display(a);
        System.out.println();
        System.out.println("Size of Tree:" + Size(a));
    }

    static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    static int Size(Node root) {
        return (root == null) ? 0 : 1 + Size(root.left) + Size(root.right);
    }
}
