package Recursion;

public class HanoiTower {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }

    private static void hanoi(int n, char A, char B, char C) {
        if (n == 0) return;

        hanoi(n - 1, A, C, B); //Move n-1 from source(A) to helper(B) viva Destination(C).

        System.out.println("Move disk " + n + " from " + A + " to " + C); //Move nth i.e largest from source(A) to Destination(C).

        hanoi(n - 1, B, A, C); //Move n-1 from helper(B) to Destination(C) viva source(A).
    }
}
