package Day15.FirstNonRepeating;

public class Main {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int out1 = brute.firstNonRepeatingCharacter(s);
        int out2 = optimised.firstNonRepeatingCharacter(s);
        System.out.println(out1);
        System.out.println(out2);
    }
}
