package Day14.SimplifyPath;
import java.util.Stack;

public class Solution {
    public static String simplifyPath(String path) {
        String[] pathArray = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String part : pathArray) {
            if (part.equals("") || part.equals("."))
                continue;
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String x : stack) {
            result.append("/").append(x);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
