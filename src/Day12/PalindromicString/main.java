package Day12.PalindromicString;

public class main {
    public static void main(String[] args) {
        String s = "aaa";
        int out1 = brute.palindromicString(s);
        int out2 = optimised.palindromicString(s);
        System.out.println(out1);
        System.out.println(out2);
    }
}
