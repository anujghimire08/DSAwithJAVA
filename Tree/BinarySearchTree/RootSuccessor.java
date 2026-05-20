package Tree.BinarySearchTree;

public class RootSuccessor {
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
    static int successor(Node root) {
        Node suc = root.right;
        while (suc.left != null) suc = suc.left;
        return suc.val;
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) root = insert(root, val);
        System.out.println("Predecessor: " + successor(root));

    }
}
