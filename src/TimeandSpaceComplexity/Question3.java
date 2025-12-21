package TimeandSpaceComplexity;

public class Question3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {     // 'n' Units
            for (int j = 0; j < n; j++) { // 'n' Units
                System.out.println("j");
            }
            for (int k = 0; k < n; k++) { // 'n' Units
                System.out.println("k");
            }
            System.out.println("i");
        }
    }

}
// calculating Time Complexity
// Method 1 (Adding Inner loops and then multiplying)
// f(n):n* 2n
// f(n): 2n^2 i.e O(n^2)
// OR
// Method 2 (Multiplying Inner loops with outer)
// f(n): i*j + i*k
// f(n): n*n + n*n
// f(n): n^2 +n^2
// f(n): 2n^2 i.e O(n^2)

