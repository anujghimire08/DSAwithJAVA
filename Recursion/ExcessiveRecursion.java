package Recursion;

public class ExcessiveRecursion {
    public static void main(String[] args) {
        infinite();
    }

    // Function with no base case is defined
    static void infinite() {
        System.out.println("DSA");
        infinite();
    }
}