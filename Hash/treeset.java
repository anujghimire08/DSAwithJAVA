package Hash;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(); // order set (BST)
        tree.add(20);
        tree.add(10);
        tree.add(50);
        tree.add(30);
        tree.add(40);
        System.out.println("Tree Size: " + tree.size());
        System.out.println(tree.contains(30));
        tree.remove(30);
        System.out.println("Tree Size: " + tree.size());
        System.out.println(tree);
    }
}
