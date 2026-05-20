package Sorting;

// Sort Taking Pivot as middle
public class QuickSort {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];

        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    static void sort(int[] arr, int low, int high) {
        int partition = partition(arr, low, high);
        if (low < partition - 1) sort(arr, low, partition - 1);
        if (high > partition) sort(arr, partition, high);
    }

    public static void main(String[] args) {
        int[] arr = {23, 13, 17, 11, 10, 14, 12};
        sort(arr, 0, arr.length - 1);
        for (int val : arr) System.out.print(val + " ");
    }
}
// Pick a pivot i.e middle element
//Rearrange array to make - Left side smaller than pivot & Right side - greater than pivot
//Recursively apply same process