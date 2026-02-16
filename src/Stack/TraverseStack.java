package Stack;

import java.util.Stack;

public class TraverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        while (!st.isEmpty()) {
            int top = st.pop();
            System.out.print(top + " ");
            st1.push(top);
        }
        System.out.println();
        while (!st1.isEmpty()) {
            int top = st1.pop();
            System.out.print(top + " ");
            st.push(top);
        }
    }
}
