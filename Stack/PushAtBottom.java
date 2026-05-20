package Stack;

import  java.util.Stack;
public class PushAtBottom {
   static void pushAtBottom( Stack<Integer> st , int el){
       if(st.isEmpty()){
           st.push(el);
           return;
       }
       int val = st.pop();
        pushAtBottom(st , el);
        st.push(val);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int el = 0;
        System.out.print("Before:");
        System.out.println(st);
        System.out.print("After:");
        pushAtBottom(st, el);
        System.out.println(st);
    }
}
