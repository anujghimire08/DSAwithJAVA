package Sorting;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = {49, 74, 25, 36, 88, 18, 31};
        System.out.print("Before: ");
        for (int el : arr) System.out.print(el + " ");
        for (int i = 0; i < arr.length; i++) { // no of pass
            int min = i;
            for (int j = i + 1; j < arr.length; j++) { // searching
                if (arr[min] > arr[j]) { // check min element idx
                    min = j;
                }
            }
            // swapping
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.print("After: ");
        for (int el : arr) System.out.print(el + " ");
    }
}
