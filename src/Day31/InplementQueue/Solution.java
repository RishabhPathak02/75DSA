package Day31.InplementQueue;

import java.util.Stack;

public class Solution {
    static Stack<Integer> st1;
    static Stack<Integer> st2;

    public Solution() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public static void push(int x) {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(x);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public static int pop() {
        return st1.pop();
    }

    public static int peek() {
        return st1.peek();
    }

    public static boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
