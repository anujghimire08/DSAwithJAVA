package Array.ArrayOperation.Insertion;

public class InsertionAtEnd {
    public static void main(String[] args) {
        int[] arr = {0, 10, 20, 30, 40, 50};
        int[] newArr = new int[arr.length + 1];
        int value = 60;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        for (int n : newArr) {
            System.out.print(n + " ");
        }
    }
}
