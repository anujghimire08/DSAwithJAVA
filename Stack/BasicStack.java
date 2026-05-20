package Stack;
import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
//        st.pop(); UNDERFLOW
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.size()); // Auxiliary Space = O(n)
        st.push(40);
        st.push(50);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.pop()); // it returns the topmost element and remove it.
        System.out.println(st);
    }
}
