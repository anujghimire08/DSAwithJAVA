package Sorting;

public class MergeSort {
    static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return; // end when length is 1
//        step 1 - make new two empty array
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];
//        step 2 - copy and paste original array elements to new array a , b
        int idx = 0;
        for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for (int i = 0; i < b.length; i++) b[i] = arr[idx++];
//        step 3 - Recursion
        mergeSort(a);
        mergeSort(b);
//        step 4 - merge array 'a' and 'b' into arr
        merge(a, b, arr);
    }

    static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while (i < a.length) arr[k++] = a[i++];
        while (j < b.length) arr[k++] = b[j++];
    }

    public static void main(String[] args) {
        int[] arr = {23, 13, 17, 11, 10, 14, 12};
        System.out.print("Before: ");
        for (int el : arr) System.out.print(el + " ");
        mergeSort(arr);
        System.out.println();
        System.out.print("After: ");
        for (int el : arr) System.out.print(el + " ");
    }
}
