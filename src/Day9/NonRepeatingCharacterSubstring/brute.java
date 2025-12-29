package Day9.NonRepeatingCharacterSubstring;

import java.util.HashSet;
import java.util.Set;

public class brute {
    public static int findNonRepeatingCharacterSubstring(String st) {
        int max = 0 ;
        for(int i = 0 ; i<st.length() ; i++){
        Set<Character> set = new HashSet<>();
            for(int j = i ; j<st.length() ; j++){
                if(set.contains(st.charAt(j)))break;
                set.add(st.charAt(j));
                max = Math.max(max , j-i+1);
            }
        }
        return max ;
    }
}
