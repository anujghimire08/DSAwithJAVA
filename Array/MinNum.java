package Array;

import java.util.Arrays;

public class MinNum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,-8,5};
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            min = arr[i];
            break;
        }
        System.out.println(min);

        // OR
//        int [] arr = {1,2,3,4,-8,5};
//        int min = Integer.MAX_VALUE;
//        for(int x : arr){
//            if(x < min){
//                min = x;
//            }
//        }
//        System.out.println(min);

    }
}
