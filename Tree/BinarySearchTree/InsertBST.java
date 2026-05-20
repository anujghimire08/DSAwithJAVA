package Tree.BinarySearchTree;

// BST Structure: Before
//
//         50
//       /    \
//     30      70
//    /  \    /  \
//  20   40  60   80
//
// BST Structure: After
//
//         50
//       /    \
//     30      70
//    /  \    /  \
//  20   40  60   80
//          /
//         55
public class InsertBST {
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        if (val > root.val) root.right = insert(root.right, val);
        return root;
    }


    static void display(Node root) {
        if (root == null) return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) root = insert(root, val);
        display(root);
        insert(root, 55);
        System.out.println();
        display(root);
    }

}
