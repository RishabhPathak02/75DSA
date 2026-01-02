package Day13.MinimunWindowSubstring;

import java.util.HashMap;
import java.util.Map;

public class optimised {
    public static String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        int left = 0, right = 0, start = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        while (right < s.length()) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                if (map.get(current) > 0) {
                    count--;
                }
                map.put(current, map.get(current) - 1);
            }
            right++;
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }
                left++ ;
            }
        }
        return  minLen == Integer.MAX_VALUE ? "" : s.substring(start , start+minLen);
    }
}
