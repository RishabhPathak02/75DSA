package Day8.ValidAnagram;

import java.util.Arrays;

public class brute {
    public static boolean valid(String s, String t) {
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(ts);
        return Arrays.equals(st, ts);
    }
}
