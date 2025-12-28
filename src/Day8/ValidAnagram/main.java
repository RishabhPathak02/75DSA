package Day8.ValidAnagram;

public class main {
    public static void main(String[] args) {
        String s = "rat";
        String t = "cat";
        boolean out1 = brute.valid(s, t);
        boolean out2 = optimised.valid(s, t);
        System.out.println(out1);
        System.out.println(out2);
    }
}
