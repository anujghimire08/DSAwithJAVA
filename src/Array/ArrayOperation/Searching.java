package Array.ArrayOperation;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 6, 8};
        boolean found = false;
        int needElement = 2;
        for (int n : arr) {
            if (n == needElement) {
                System.out.println("Element " + needElement + " Found");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + needElement + " Not Found");
        }
    }
}
