package Stack;

import java.util.Stack;

public class ReverseStack {
    static void atBottom(Stack<Integer> st , int el){
        if(st.isEmpty()){
            st.push(el);
            return;
        }

        int val = st.pop();
        atBottom(st, el);
        st.push(val);
    }

    static  void reverse(Stack<Integer> st){
        if(st.size() <= 1) return;
        int val = st.pop();
        reverse(st);
        atBottom(st, val);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
