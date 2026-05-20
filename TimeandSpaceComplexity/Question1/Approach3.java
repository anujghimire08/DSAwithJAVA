package TimeandSpaceComplexity.Question1;

public class Approach3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5};
        int arrSum = 0;
        for(int i = 0; i< arr.length;i++){
            arrSum +=arr[i];
        }
        int sum1to5 = (5*6) / 2;
        System.out.println("Duplicate is : "+ (arrSum-sum1to5));
    }
}
// optimize version