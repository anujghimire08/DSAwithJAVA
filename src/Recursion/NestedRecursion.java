package Recursion;

public class NestedRecursion {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(countDigit(n));
    }

    // Function parameter itself is a recursive call
    private static int countDigit(int n) {
        return (n < 10) ? n : countDigit(countDigit(n / 10) + n % 10);
    }

}
