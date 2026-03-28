package Recursion;

public class DirectRecursion {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    // Direct → function calls itself directly.
    static private int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n - 1);
    }

}
