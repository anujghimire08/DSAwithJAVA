package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPostfix {
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static void main(String[] args) {
        String infix = "a+b*(c^d-e)";
        String postfix = "";
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix += ch;
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    postfix += operator.pop();
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && precedence(ch) <= precedence(operator.peek())) {
                    postfix += operator.pop();
                }
                operator.push(ch);
            }
        }
        while (!operator.isEmpty()) {
            postfix += operator.pop();
        }
        System.out.print("Final Postfix of " + infix + " is: " + postfix);
    }
}