package Array;
// add 10 on even index and product by 2 in odd index
public class IndexBasedOperation {
    public static void main(String[] args) {
        int [] arr = { 1,2,3,4,5};
        for(int x : arr){
            System.out.print(x);
        }
        System.out.println();
        for(int  i = 0; i<arr.length;i++){
            if(i%2==0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }

        }
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
