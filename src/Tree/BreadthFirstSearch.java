package Tree;

import java.util.LinkedList;
import java.util.Queue;

// Breadth First Search OR Level Order Traversal
public class BreadthFirstSearch {
    public static void main(String[] args) {
//            1
//          /   \
//         2     3
//        /  \  /  \
//       4   5  6   7
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        a.left = b;
        b.left = d;
        b.right = e;
        a.right = c;
        c.left = f;
        c.right = g;
        Display(a);
    }

    static void Display(Node root) {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node front = q.poll();
            System.out.print(front.val + " ");
            if (front.left != null) q.add(front.left);
            if (front.right != null) q.add(front.right);
        }
    }
}
