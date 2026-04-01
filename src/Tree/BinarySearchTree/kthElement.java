package Tree.BinarySearchTree;

public class kthElement {
    //         50
//       /    \
//     30      70
//    /  \    /  \
//  20   40  60   80
//
    static Node root = null;

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        if (val > root.val) root.right = insert(root.right, val);
        return root;
    }

    static void display(Node root) {
        if (root == null) return;
        display(root.left);
//        System.out.print(root.val + " ");
        createArr(root.val);
        display(root.right);
    }

    static int[] arr = new int[7];
    static int i = 0;

    static void createArr(int val) {
        arr[i++] = val;
    }


    static int getSize(Node root) {
        return (root == null) ? 0 : 1 + getSize(root.left) + getSize(root.right);
    }

    public static void main(String[] args) {
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int val : values) root = insert(root, val);
        display(root);
        for (int val : arr) System.out.print(val + " ");
    }
}
