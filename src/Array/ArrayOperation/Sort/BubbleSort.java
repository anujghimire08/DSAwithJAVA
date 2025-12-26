package Array.ArrayOperation.Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {55, 32, 44, 25, 16};
        int temp, length = arr.length;
        for (int i = 1; i < length; i++) {
            boolean swap = false;
            for (int j = 0; j < length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        for (int n : arr) {
            System.out.print(n + " ");
        }

    }
}
