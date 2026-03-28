package Recursion;

public class TailRecursion {
    public static void main(String[] args) {
        System.out.print(pow(2, 3));
    }

    //The last operation is the recursive call.
    static private int pow(int base, int power) {
        if (power == 0) return 1;
        return base * pow(base, power - 1);
    }
}
