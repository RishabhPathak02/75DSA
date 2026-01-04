package Day15.FirstNonRepeating;

public class optimised {
    public static int firstNonRepeatingCharacter(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            freq[current - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (freq[current - 'a'] == 1) return i;
        }
        return -1;
    }
}
