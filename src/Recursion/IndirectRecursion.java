package Recursion;

public class IndirectRecursion {
    public static void main(String[] args) {
        int n = 6;
        odd(n);
    }

    static private void odd(int n) {
        if (n == 0) return;
        if (n % 2 == 0) {
            even(n);
        } else {
            System.out.print("odd -> " + n + " ");
            even(n - 1);
        }
    }

    static private void even(int n) {
        if (n == 0) return;
        System.out.print("Even -> " + n + " ");
        odd(n - 1);
    }


}
