package Recursion;

import java.util.Scanner;

public class print1toN {
    static void print(int x, int n) {
        if (x > n) return;
        System.out.println(x);
        print(x + 1, n);
    }

    static void print(int x) {
        if (x == 0) return;
        print(x - 1);
        System.out.println(x);
    }

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter nth value:");
//        int n = sc.nextInt();
//        print(1, n);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth value:");
        int n = sc.nextInt();
        print(n);
    }
}
