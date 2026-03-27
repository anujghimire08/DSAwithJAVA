package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    private static void pip(int n) {
        if (n == 0) return;
        System.out.print("pre:" + n + " ");
        pip(n - 1);
        System.out.print("in:" + n + " ");
        pip(n - 1);
        System.out.print("post:" + n + " ");
    }
}
