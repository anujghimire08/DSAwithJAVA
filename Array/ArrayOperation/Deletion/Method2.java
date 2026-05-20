package Array.ArrayOperation.Deletion;

public class Method2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int indexPosition = 2;
        for (int i = indexPosition; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
