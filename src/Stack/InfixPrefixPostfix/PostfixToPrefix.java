package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        Stack<String> prefix = new Stack<>();
        String postfix = "AB-DE+F*/";
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                prefix.push(ch + "");
            } else {
                String operand2 = prefix.pop();
                String operand1 = prefix.pop();
                prefix.push(ch + operand1 + operand2);
            }
        }
        System.out.println(prefix.peek());
    }
}
