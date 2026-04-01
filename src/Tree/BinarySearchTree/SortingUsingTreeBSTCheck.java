package Tree.BinarySearchTree;

import java.util.ArrayList;

public class SortingUsingTreeBSTCheck {

    // VALID BST (isBST -> true)
    //        50
    //       /  \
    //     30    70
    //    /  \   / \
    //  20   40 60 80


    // INVALID BST (isBST -> false)
    //        50
    //       /  \
    //     30    70
    //    /  \
    //  20    60  <-- violates BST

    static void display(Node root) {
        if (root == null) return;
        display(root.left);
        createArr(root.val);
        display(root.right);
    }

    static ArrayList<Integer> arr = new ArrayList<>();

    static void createArr(int val) {
        arr.add(val);
    }

    // In a BST, inorder traversal is always sorted, so checking sorting
    //    TC : O(n) , SC : O(h)
    static boolean isBST() {
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) >= arr.get(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // valid bst
//        Node root = new Node(50);
//        root.left = new Node(30);
//        root.right = new Node(70);
//        root.left.left = new Node(20);
//        root.left.right = new Node(40);
//        root.right.left = new Node(60);
//        root.right.right = new Node(80);

//        invalid bst
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(60);
        display(root);
        System.out.println("isBST: " + isBST());
    }
}
