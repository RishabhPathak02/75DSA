package Day14.EncodeAndDecodeString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String encode(String s[]) {
        StringBuilder sb = new StringBuilder();
        for(String part : s){
            sb.append(part.length()).append("#").append(part);
        }
        return sb.toString();
    }
    public static String[] decode(String s) {
            //5#hello5#world
        List<String>result = new ArrayList<>();
        int i = 0 ;
        while(i<s.length()){
            int j = i ;
            while(s.charAt(j)!='#')j++;
            int len = Integer.parseInt(s.substring(i,j));
            j++;
            String word = s.substring(j,j+len);
            result.add(word);
            i = len+j;
        }
        return result.toArray(new String[0]);
    }
}
