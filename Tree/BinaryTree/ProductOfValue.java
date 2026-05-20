package Tree.BinaryTree;

public class ProductOfValue {
    public static void main(String[] args) {
//            1
//          /   \
//         2     3
//        /  \  /  \
//       4   5  6   7
        Node a = new Node(1);
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
        System.out.println("Sum of Node Value is: " + Product(a));
    }

    static int Product(Node root) {
        return (root == null) ? 1 : root.val * Product(root.left) * Product(root.right);
    }
}
