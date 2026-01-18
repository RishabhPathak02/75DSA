package Day29.LargestRectangleHistrogram;

import java.util.Stack;

public class Optimised {
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= n; i++) {
            int curr = i == n ? 0 : heights[i];
            while (!st.isEmpty() && curr < heights[st.peek()]) {
                int currHeight = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();
                int width = right - left - 1;
                int area = width * currHeight;
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
}
