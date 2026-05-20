package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class InfixToPostfix2 {
    static int Precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Stack<String> postfix = new Stack<>();
        Stack<Character> operator = new Stack<>();
        String infix = "a+b*(c^d-e)";
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                postfix.push(ch + "");
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.isEmpty() && operator.peek() != '(') {
                    String operand2 = postfix.pop();
                    String operand1 = postfix.pop();
                    postfix.push(operand1 + operand2 + operator.pop());
                }
                operator.pop();
            } else {
                while (!operator.isEmpty() && Precedence(ch) <= Precedence(operator.peek())&& operator.peek() != '(') {
                    String operand2 = postfix.pop();
                    String operand1 = postfix.pop();
                    postfix.push(operand1 + operand2 + operator.pop());
                }
                operator.push(ch);
            }
        }
        while (!operator.isEmpty()) {
            String operand2 = postfix.pop();
            String operand1 = postfix.pop();
            postfix.push(operand1 + operand2 + operator.pop());
        }
        System.out.println("Postfix: " + postfix.peek());
    }
}
