package Stack.InfixPrefixPostfix;

import java.util.Stack;

public class InfixExpressionEvaluation {
    public static void main(String[] args) {
        String str = "6-5+3*4/6";
        Stack<Integer> value = new Stack<Integer>();
        Stack<Character> operator = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                value.push(ascii - 48);
            } else if (operator.isEmpty()) {
                operator.push(ch);
            } else {
                if (ch == '+' || ch == '-') {
                    int val2 = value.pop();
                    int val1 = value.pop();
                    if (operator.peek() == '+') value.push(val1 + val2);
                    if (operator.peek() == '-') value.push(val1 - val2);
                    if (operator.peek() == '*') value.push(val1 * val2);
                    if (operator.peek() == '/') value.push(val1 / val2);
                    operator.pop();
                    operator.push(ch);
                } else if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        int val2 = value.pop();
                        int val1 = value.pop();
                        if (operator.peek() == '*') value.push(val1 * val2);
                        if (operator.peek() == '/') value.push(val1 / val2);
                        operator.pop();
                        operator.push(ch);
                    } else {
                        operator.push(ch);
                    }
                }
            }
        }
        while (value.size() > 1) {
            int val2 = value.pop();
            int val1 = value.pop();
            if (operator.peek() == '+') value.push(val1 + val2);
            if (operator.peek() == '-') value.push(val1 - val2);
            if (operator.peek() == '*') value.push(val1 * val2);
            if (operator.peek() == '/') value.push(val1 / val2);
            operator.pop();
        }
        System.out.print(value.peek());
    }
}
