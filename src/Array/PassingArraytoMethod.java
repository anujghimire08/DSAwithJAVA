package Array;

public class PassingArraytoMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before:"+arr[0]);
        Change(arr);
        System.out.println("After:"+arr[0]);
    }

    public static void Change(int [] arr) {
        arr[0]=0;
    }
}
