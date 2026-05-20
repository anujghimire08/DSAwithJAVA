package Tree.BinarySearchTree;

public class RootPredecessor {
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    //     50
//       /    \
//     30      70
//    /  \    /  \
//  20   40  60   80
    static int predecessor(Node root) {
        Node pre = root.left;
        while (pre.right != null) pre = pre.right;
        return pre.val;
    }


    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) root = insert(root, val);
        System.out.println("Predecessor: " + predecessor(root));
    }
}
