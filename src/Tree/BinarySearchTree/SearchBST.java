package Tree.BinarySearchTree;

public class SearchBST {
    //         50
    //       /    \
    //     30      70
    //    /  \    /  \
    //  20   40  60   80
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    static boolean Search(Node root, int key) {
        if (root == null) return false;
        if (root.val == key) return true;
        if (key < root.val) return Search(root.left, key);
        else return Search(root.right, key);
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
        display(root);
        int key = 70;
        System.out.println();
        System.out.println(Search(root, key) ? key + " Found" : key + " Not Found");
    }
}
