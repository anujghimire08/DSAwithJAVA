package TimeandSpaceComplexity.Question1;

public class Approach2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5};
        boolean[] brr = new boolean[arr.length + 1];
        for(int i  = 0 ; i< arr.length;i++){
            if(brr[arr[i]]== true){
                System.out.println(arr[i]);
            }else{
                brr[i]=true;
            }
        }
    }
}
