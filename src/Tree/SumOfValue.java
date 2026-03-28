package Tree;

public class SumOfValue {
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
        System.out.println("Sum of Node Value is: " + Sum(a));
    }

    static int Sum(Node root) {
        return (root == null) ? 0 : root.val + Sum(root.left) + Sum(root.right);
    }
}
