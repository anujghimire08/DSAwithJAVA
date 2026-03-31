package Tree.BinaryTree;

public class TreeEdge {
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
        int size = Size(a);
        System.out.println("Edge of Tree:" + Edge(size));
    }

    static int Size(Node root) {
        return (root == null) ? 0 : 1 + Size(root.left) + Size(root.right);
    }

    static int Edge(int size) {
        return size - 1;
    }

}
