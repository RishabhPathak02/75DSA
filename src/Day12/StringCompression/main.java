package Day12.StringCompression;

public class main {
    public static void main(String[] args) {
        char[]chars1 = {'a','a','b','b','c','c','c'};
        char[]chars2 = {'a','a','b','b','c','c','c'};
        int out1 = brute.compress(chars1);
        int out2 = optimised.compress(chars2);
        System.out.println(out1);
        System.out.println(out2);
    }
}
