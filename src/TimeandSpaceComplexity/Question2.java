package TimeandSpaceComplexity;

public class Question2 {

    public static void main(String[] args) {
        int n = 5; // assignment Operator
        for (int i = 0; i < n; i++) { // loops
            System.out.println("Hello"); // printing statement
        }

    }
}
// calculating Time Complexity
// f(n): assignment Operator + loop + printing statement
//f(n): 1 + 1 + (n+1) + n + n
// f(n): 3 + 3n
// i.e f(n): n == O(n)