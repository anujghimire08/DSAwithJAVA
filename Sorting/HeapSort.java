package Sorting;

public class HeapSort {
    static void heapsort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i); // build max heap
        for (int i = n - 1; i > 0; i--) { // sorting
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }

    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1; // get left node of root
        int right = 2 * i + 2; // get left node of root
        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }


    public static void main(String[] args) {
        int[] arr = {11, 22, 10, 14, 12, 13, 17};
        System.out.print("Before: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
        heapsort(arr);
        System.out.print("After: ");
        for (int val : arr) System.out.print(val + " ");
    }
}
