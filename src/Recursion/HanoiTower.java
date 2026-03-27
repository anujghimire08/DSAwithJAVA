package Recursion;

public class HanoiTower {
    public static void main(String[] args) {
        int n = 3;
        Hanoi(n, 'A', 'B', 'C');
        Steps(n);
    }

    private static void Hanoi(int n, char A, char B, char C) {
        if (n == 0) return;

        Hanoi(n - 1, A, C, B); //Move n-1 from source(A) to helper(B) viva Destination(C).

        System.out.println("Move disk " + n + " from " + A + " to " + C); //Move nth i.e largest from source(A) to Destination(C).

        Hanoi(n - 1, B, A, C); //Move n-1 from helper(B) to Destination(C) viva source(A).
    }

    private static void Steps(int n) {
        int step = (int) Math.pow(2, n) - 1;
        System.out.println("Total Step for " + n + " disks is:" + step);
    }
}
