package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        Stack<String> postfix = new Stack<>();
        String prefix = "/AB*+DEF";
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.push(ch + "");
            } else {
                String operand1 = postfix.pop();
                String operand2 = postfix.pop();
                postfix.push(operand1 + operand2 + ch);
            }
        }
        System.out.println(postfix.peek());
    }
}
