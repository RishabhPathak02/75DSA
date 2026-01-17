package Day28.DecodeString;

import java.util.Stack;

public class Optimised {
    public static String decodeString(String s) {
        Stack<Integer>countStack = new Stack<>();
        Stack<StringBuilder>strStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count = count * 10 + (s.charAt(i)-'0');
            }else if(ch == '['){
                countStack.push(count);
                strStack.push(curr);
                curr = new StringBuilder();
                count = 0 ;

            }else if(ch == ']'){
                int repeat = countStack.pop();
                StringBuilder prev = strStack.pop();
                for(int j = 0 ; j<repeat ; j++){
                    prev.append(curr);
                }
                curr = prev ;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
