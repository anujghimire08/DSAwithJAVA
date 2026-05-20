package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println("Reverse of " + n + " is: " + rev(n, 0));
    }

    static int rev(int n, int r) {
        return (n == 0) ? r : rev(n / 10, r * 10 + n % 10);
    }
}
