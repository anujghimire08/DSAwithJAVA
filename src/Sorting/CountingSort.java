package Sorting;

public class CountingSort {
    static void sort(int[] arr) {
//        finding the largest element of array
        int max = findMax(arr); // 5
        int[] frequency = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            /*
               0 2 0 3 1 2 | repeat of val
               0 1 2 3 4 5 | idx
             */
            frequency[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < frequency.length; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                arr[k++] = i;
            }
        }
        // this method is (simple,direct), it don't have stability cause order of same elements may change
    }

    static void countSort(int[] arr) {
        int[] output = new int[arr.length];
        int max = findMax(arr);
        int[] frequency = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        // making prefix sum array of count array
        for (int i = 1; i < frequency.length; i++) {
            frequency[i] += frequency[i - 1];
        }
        // finding idx of each element in the original array
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = frequency[arr[i]] - 1;
            output[idx] = arr[i];
            frequency[arr[i]]--;
        }
        // manipulating value of arr with output
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void display(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
        countSort(arr);
        display(arr);
    }
}
