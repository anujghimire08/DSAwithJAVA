package Tree.BinaryTree;
public class ProductOfNonZeroValue {
    public static void main(String[] args) {
        //         2
        //       /   \
        //      0     3
        //     / \
        //    4   5

        Node root = new Node(2);
        root.left = new Node(0);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Product of non-zero nodes: " + productNonZero(root));
    }

    static int productNonZero(Node root) {
        if (root == null) return 1;

        int leftProd = productNonZero(root.left);
        int rightProd = productNonZero(root.right);

        if (root.val == 0) return leftProd * rightProd; // avoid zero
        return root.val * leftProd * rightProd;
    }
}
