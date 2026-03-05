package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPrefix {
    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static void main(String[] args) {
        String infix = "(A+B)*C-D+f";
        Stack<String> prefix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                prefix.push(ch + "");
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    String operand2 = prefix.pop();
                    String operand1 = prefix.pop();
                    prefix.push(operator.pop() + operand1 + operand2);
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && precedence(ch) <= precedence(operator.peek()) && operator.peek() != '(') {
                    String operand2 = prefix.pop();
                    String operand1 = prefix.pop();
                    prefix.push(operator.pop() + operand1 + operand2);
                }
                operator.push(ch);
            }
        }
        while (!operator.isEmpty()) {
            String operand2 = prefix.pop();
            String operand1 = prefix.pop();
            prefix.push(operator.pop() + operand1 + operand2);
        }
        System.out.println(prefix.peek());
    }
}