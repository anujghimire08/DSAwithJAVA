package Tree.BinarySearchTree;

class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
    }
}

// BST Structure:
//
//         50
//       /    \
//     30      70
//    /  \    /  \
//  20   40  60   80
//
public class CreationOfBinarySearchTree {
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        if (val > root.val) root.right = insert(root.right, val);
        return root;
    }


    static void display(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) root = insert(root, val);
        System.out.println("BST Created!");
        display(root);
    }

}
