package Recursion;

import java.util.Scanner;

public class nthFibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Value:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
//        System.out.println(fib(n));
//        to get nth value comment loop and print fib()
    }

    static int fib(int n) {
        return (n == 0 || n == 1) ? n : fib(n - 1) + fib(n - 2);
    }

}
