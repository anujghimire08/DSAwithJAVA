package Tree.BinarySearchTree;

public class CheckBinaryTreeOrNot {

    static Node root;


    static boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.val <= min || root.val >= max) return false;

        return isBST(root.left, min, root.val) &&
                isBST(root.right, root.val, max);
    }

    public static void main(String[] args) {

        // valid bst
        Node bst = new Node(50);
        bst.left = new Node(30);
        bst.right = new Node(70);
        bst.left.left = new Node(20);
        bst.left.right = new Node(40);
        bst.right.left = new Node(60);
        bst.right.right = new Node(80);

//        invalid bst
//        root = new Node(50);
//        root.left = new Node(30);
//        root.right = new Node(70);
//        root.left.left = new Node(20);
//        root.left.right = new Node(60);

        System.out.println(
                isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE) ? "True" : "False"
        );
    }
}