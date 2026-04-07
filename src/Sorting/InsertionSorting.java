package Sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr = {50, 30, 10, 40, 20};
        System.out.print("Before:" + " ");
        for (int e : arr) System.out.print(e + " ");
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        System.out.println();
        System.out.print("After:" + " ");
        for (int e : arr) System.out.print(e + " ");
    }
}
