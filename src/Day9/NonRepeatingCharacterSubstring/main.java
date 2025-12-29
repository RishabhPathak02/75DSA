package Day9.NonRepeatingCharacterSubstring;

public class main {
    public static void main(String[] args) {
        String st = "abcabcbb";
        int out1 = brute.findNonRepeatingCharacterSubstring(st);
        int out2 = optimised.findNonRepeatingCharacterSubstring(st);
        System.out.println(out1);
        System.out.println(out2);
    }
}
