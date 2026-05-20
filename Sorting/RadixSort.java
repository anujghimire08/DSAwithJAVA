package Sorting;

public class RadixSort {
    static void countSort(int[] arr, int place) {
        int[] frequency = new int[10];
        for (int i = 0; i < arr.length; i++) {
            frequency[(arr[i] / place) % 10]++;
        }
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = frequency[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];
            frequency[(arr[i] / place) % 10]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int el : arr) {
            if (el > max) max = el;
        }
        return max;
    }

    static void radixSort(int[] arr) {
        int max = findMax(arr); // give max el
        for (int place = 1; max / place > 0; place *= 10) { // apply 'counting sort' to sort el based on place
            countSort(arr, place);
        }
    }

    static void display(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.print("Before: ");
        display(arr);
        System.out.println();
        System.out.print("After: ");
        radixSort(arr);
        display(arr);
    }
}
