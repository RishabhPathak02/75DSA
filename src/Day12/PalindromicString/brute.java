package Day12.PalindromicString;

public class brute {
    public static int palindromicString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (palindromic(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean palindromic(String str, int l, int r) {
        while (l < r){
            if(str.charAt(l++) != str.charAt(r--))return false;
        }
        return true;
    }
}
