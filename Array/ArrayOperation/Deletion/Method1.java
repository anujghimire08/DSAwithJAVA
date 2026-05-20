package Array.ArrayOperation.Deletion;

public class Method1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] newArr = new int[arr.length - 1];
        int indexPosition = 3;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == indexPosition) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for (int n : newArr) {
            System.out.print(n + " ");
        }
    }
}
