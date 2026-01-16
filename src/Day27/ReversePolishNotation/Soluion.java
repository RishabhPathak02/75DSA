package Day27.ReversePolishNotation;
import java.util.Stack;

public class Soluion {
    public static int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for (String ch : tokens) {
            if (!st.isEmpty()) {
                if (ch.equals("*")) {
                    int opernd1 = Integer.valueOf(st.pop());
                    int opernd2 = Integer.valueOf(st.pop());
                    st.push(opernd2 * opernd1);
                    continue ;

                } else if (ch.equals("+")) {
                    int opernd1 = Integer.valueOf(st.pop());
                    int opernd2 = Integer.valueOf(st.pop());
                    st.push(opernd2 + opernd1);
                    continue ;

                } else if (ch.equals("-")) {
                    int opernd1 = Integer.valueOf(st.pop());
                    int opernd2 = Integer.valueOf(st.pop());
                    st.push(opernd2 - opernd1);
                    continue ;

                } else if (ch.equals("/")) {
                    int opernd1 = Integer.valueOf(st.pop());
                    int opernd2 = Integer.valueOf(st.pop());
                    st.push(opernd2 / opernd1);
                    continue ;
                }
            }
            st.push(Integer.valueOf(ch));
        }
        return st.pop();
    }
}
