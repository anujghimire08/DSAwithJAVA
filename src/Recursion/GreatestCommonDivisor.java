package Recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int result = gcd(12, 18);
        System.out.println(result);
    }

    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
