package Array;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []  arr = new int [5] ;
        System.out.print("Enter Array Value:");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>max){
                max = x;
            }
        }
        System.out.println("Max:"+max);
    }
}
// also can be done using
// Arrays.sort();