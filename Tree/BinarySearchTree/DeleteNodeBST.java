package Tree.BinarySearchTree;

public class DeleteNodeBST {
    /*
                50
              /    \
            30      70
           /  \    /  \
         20   40  60   80
       */
    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right = new Node(70);
        root.right.left = new Node(60);
        root.right.right = new Node(80);
        System.out.print("Before Deletion:");
        display(root);
        System.out.println();
        root = delete(root, 50);
        System.out.print("After Deletion:");
        display(root);
    }

    static void display(Node root) {
        if (root == null) return;
        display(root.left);
        System.out.print(root.val + " ");
        display(root.right);
    }

    static Node delete(Node root, int target) {
        if (root == null) return null;
        if (root.val > target) root.left = delete(root.left, target);
        else if (root.val < target) root.right = delete(root.right, target);
        else {
            // case 1 : leaf Node
            if (root.left == null && root.right == null) return null;
            // case 2 : 1 child Node
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            // case 3 : 2 child Node
            Node predecessor = root.left;
            while (predecessor.right != null) predecessor = predecessor.right;
            root.val = predecessor.val;
            root.left = delete(root.left, predecessor.val);
        }
        return root;
    }
}
