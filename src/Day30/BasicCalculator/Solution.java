package Day30.BasicCalculator;

import java.util.Stack;

public class Solution {
    public static int calculate(String s) {
        Stack<Integer> st = new Stack<>();
        int n = s.length();
        int result = 0;
        int num = 0;
        int sign = 1;
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if (Character.isDigit(curr)) {
                num = num * 10 + (curr - '0');
            } else if (curr == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (curr == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (curr == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                sign = 1;
            } else if (curr == ')') {
                result += sign * num;
                result *= st.pop();
                result += st.pop();
                num = 0;
            }
        }
        return result + num * sign;
    }
}
