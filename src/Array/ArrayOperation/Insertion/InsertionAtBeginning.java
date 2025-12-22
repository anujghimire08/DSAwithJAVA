package Array.ArrayOperation.Insertion;

public class InsertionAtBeginning {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int value = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = value;

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
