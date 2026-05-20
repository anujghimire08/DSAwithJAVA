package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
        Stack<String> infix = new Stack<>();
        String postfix = "AB-DE+F*/";
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                infix.push(ch + "");
            } else {
                String operand2 = infix.pop();
                String operand1 = infix.pop();
                infix.push(operand1 + ch + operand2);
            }
        }
        System.out.println(infix.peek());
    }
}