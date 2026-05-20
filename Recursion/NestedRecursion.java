package Recursion;

public class NestedRecursion {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(countDigitSum(n));
    }

    // Function parameter itself is a recursive call
    private static int countDigitSum(int n) {
        return (n < 10) ? n : countDigitSum(countDigitSum(n / 10) + n % 10);
    }

}
