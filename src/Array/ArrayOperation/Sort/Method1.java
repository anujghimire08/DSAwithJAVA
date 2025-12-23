package Array.ArrayOperation.Sort;

import java.util.Arrays;

public class Method1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 6, 8};
        Arrays.sort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
