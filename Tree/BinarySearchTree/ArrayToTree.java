package Tree.BinarySearchTree;

public class ArrayToTree {
    static Node createTree(int[] arr, int l, int h) {
        if (l > h) return null;
        int mid = l + (h - l) / 2;
        Node root = new Node(arr[mid]);
        root.left = createTree(arr, l, mid - 1);
        root.right = createTree(arr, mid + 1, h);
        return root;
    }

    static void display(Node root) {
        if (root == null) return;
        display(root.left);
        display(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};
        Node root = createTree(arr, 0, arr.length - 1);
        display(root);
    }
}
