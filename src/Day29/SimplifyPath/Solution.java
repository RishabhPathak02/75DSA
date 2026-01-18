package Day29.SimplifyPath;

import java.util.Stack;

public class Solution {
    public static String simplifyPath(String path) {
        String[]pathArray = path.split("/");
        Stack<String> st = new Stack<>();
        for(String part : pathArray){
            if(part.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(part.equals("") || part.equals("."))continue ;
            else{
                st.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String part : st){
            sb.append("/").append(part);
        }
        return sb.length() == 0 ? "/" : sb.toString() ;
    }
}
