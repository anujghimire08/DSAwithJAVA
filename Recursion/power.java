package Recursion;

import java.util.Scanner;

public class power {
//    static int pow(int b, int n) {
//        return (n == 0) ? 1 : b * pow(b, n - 1); TC: O(b)
//    }

    static int pow(int b, int n) {
        if (n == 0) return 1;
        int call = pow(b, n / 2);
        if (n % 2 == 0) {
            return call * call;
        } else {
            return call * call * b;
        }
//        TC: log2(n)
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base:");
        int b = sc.nextInt();
        System.out.print("Enter Power:");
        int n = sc.nextInt();
        System.out.println(b + "^" + n + ": " + pow(b, n));
    }
}
