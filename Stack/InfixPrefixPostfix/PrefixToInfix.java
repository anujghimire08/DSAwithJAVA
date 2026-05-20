package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "+*ABC";
        Stack<String> infix = new Stack<>();
        System.out.println(prefix.length());
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char ch = prefix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                infix.push(ch + "");
            } else {
                String operand1 = infix.pop();
                String operand2 = infix.pop();
                infix.push("(" + operand1 + ch + operand2 + ")");
            }
        }
        System.out.println(infix.peek());
    }

}