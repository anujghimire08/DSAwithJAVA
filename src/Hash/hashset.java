package Hash;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(40);
        hash.add(50);
        System.out.println("Hash Size: " + hash.size());
        System.out.println(hash.contains(30));
        hash.remove(30);
        System.out.println("Hash Size: " + hash.size());
    }
}
