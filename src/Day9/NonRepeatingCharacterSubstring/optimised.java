package Day9.NonRepeatingCharacterSubstring;

import java.util.HashSet;
import java.util.Set;

public class optimised {
    public static int findNonRepeatingCharacterSubstring(String st) {
        int max = 0 ;
        int left = 0 ;
        Set<Character> set = new HashSet<>();
        for(int right = 0 ; right<st.length() ; right++){
            while(set.contains(st.charAt(right))){
                set.remove(st.charAt(left));
                left++;
            }
            set.add(st.charAt(right));
            max = Math.max(max , right-left+1);
        }
        return max;
    }
}
