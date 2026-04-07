package Sorting;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {55, 32, 42, 25, 16};
        int length = arr.length;

        System.out.print("Before: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        for (int i = 1; i < length; i++) { // for no of passes
            boolean isSwapping = false;
            for (int j = 0; j < length - i; j++) { // adjacent comparison
                if (arr[j] > arr[j + 1]) { // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapping = true;
                }
            }
            if (!isSwapping) break;
        }

        System.out.println();
        System.out.print("After: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
//Time Complexity - O(n)
//Space Complexity - O(1)
