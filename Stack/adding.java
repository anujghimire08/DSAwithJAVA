package Stack;

import java.util.Scanner;
import java.util.Stack;

public class adding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.push(60);
        System.out.println(st.size());
        System.out.print("Enter Index value to add data:");
        int idx = sc.nextInt();
        System.out.print("Enter data:");
        int val = sc.nextInt();
        while(st.size() > idx){
                st1.push(st.pop());
        }
        st.push(val);

        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
}
