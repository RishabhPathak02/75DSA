package Day12.PalindromicString;

public class optimised {
    public static int palindromicString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);    //odd expand
            count += expand(s, i, i + 1);  //even expand
        }
        return count;
    }

    private static int expand(String str, int l, int r) {
        int count = 0;
        while ((l >= 0 && r < str.length()) && (str.charAt(l) == str.charAt(r))) {
            count++;
            l--;   // move left OUT
            r++;   // move right OUT
        }
        return count;
    }
}
