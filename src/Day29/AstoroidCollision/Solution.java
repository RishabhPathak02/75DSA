package Day29.AstoroidCollision;

import java.util.Stack;

public class Solution {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int a : asteroids) {
            boolean destroyed = false;
            while (!st.isEmpty() && st.peek() > 0 && a < 0) {
                if (st.peek() > Math.abs(a)) {
                    destroyed = true;
                    break;
                } else if (st.peek() == Math.abs(a)) {
                    destroyed = true;
                    st.pop();
                    break;
                } else {
                    st.pop();
                }
            }
            if (!destroyed) {
                st.push(a);
            }
        }
        int[] result = new int[st.size()];
        int index = st.size() - 1;
        while (!st.isEmpty()) {
            result[index--] = st.pop();
        }
        return result;
    }
}
