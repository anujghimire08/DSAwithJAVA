package Stack;

import java.util.Stack;
import java.util.*;

public class peeking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        System.out.print("Enter Index value to peak data:");
        int idx = sc.nextInt();
        while(st.size() > idx + 1){
                st1.push(st.pop());
        }
        System.out.println("Index Value is: " + st.peek());


        while(!st1.isEmpty()){
            st.push(st1.pop());
        }
    }
}
