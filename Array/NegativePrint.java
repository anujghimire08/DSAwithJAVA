package Array;
import java.util.Scanner;

public class NegativePrint {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [6];
        System.out.println("Enter Arrays Num: ");
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0) {
                System.out.print(arr[i]);
            }
        }

    }

}
