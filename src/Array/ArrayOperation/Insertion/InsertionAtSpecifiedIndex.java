package Array.ArrayOperation.Insertion;

public class InsertionAtSpecifiedIndex {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 40, 50, 60, 70};
        int indexPosition = 3;
        int newValue = 30;
        for (int i = arr.length - 1; i > indexPosition; i--) {
            arr[i] = arr[i - 1];
        }
        arr[indexPosition] = newValue;
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
/* OR
 Array Element Won't Exclude
        int[] arr = {0, 10, 20, 40, 50, 60, 70};
        int[] newArr = new int[arr.length + 1];
        int indexPosition = 3;
        int newValue = 30;
        for (int i = 0; i < indexPosition; i++) {
            newArr[i] = arr[i];
        }
        newArr[indexPosition] = newValue;
        for (int i = indexPosition; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        for (int n : newArr) {
            System.out.print(n + " ");
        }

*/